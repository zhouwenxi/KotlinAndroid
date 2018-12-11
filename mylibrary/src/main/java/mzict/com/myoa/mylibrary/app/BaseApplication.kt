package mzict.com.myoa.mylibrary.app

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import com.tencent.mmkv.MMKV
import java.util.*

class BaseApplication :Application(){

    override fun onCreate() {
        super.onCreate()

        context = this

        var rootDir:String = MMKV.initialize(this);
        System.out.println("mmkv root: " + rootDir);

        registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {

            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle) {
                activityLinkedList.add(activity)
            }

            override fun onActivityStarted(activity: Activity) {}

            override fun onActivityResumed(activity: Activity) {}

            override fun onActivityPaused(activity: Activity) {}

            override fun onActivityStopped(activity: Activity) {

            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

            }

            override fun onActivityDestroyed(activity: Activity) {
                activityLinkedList.remove(activity)
            }
        })

    }

    companion object {

        var context: Context? = null
        private val activityLinkedList = LinkedList<Activity>()
        private var copy= LinkedList<Activity>()

        fun exitApp() {
            // 复制了一份mActivities 集合

            synchronized(BaseApplication::class.java) {
                copy = LinkedList(activityLinkedList)
            }
            for (activity in copy) {
                activity.finish()
            }
            // 杀死当前的进程
            android.os.Process.killProcess(android.os.Process.myPid())
        }

    }


}