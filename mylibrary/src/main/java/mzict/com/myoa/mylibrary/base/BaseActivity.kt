package mzict.com.myoa.mylibrary.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * 基类处理
 */
abstract class BaseActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initLayout())
        initEvent(savedInstanceState)

    }

    /**
     * 加载布局
     */
    abstract fun initLayout(): Int

    /**
     * 逻辑处理
     */
    abstract fun initEvent(savedInstanceState: Bundle?)
}