package mzict.com.myoa.mylibrary.utils

import android.util.Log

/***
 * 日志打印
 */
class LogUtils {

    //静态方法  伴生对象
    companion object{

        var Tag="QISHUI"
        var isNeedPrint=true

        fun e(vararg obj: Any) {

            if(isNeedPrint){
                var sb = StringBuffer();
                for (j in obj.indices) {
                    sb.append(j).append(",")
                }
                Log.e(Tag,sb.toString())
            }
        }

    }


}