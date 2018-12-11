package com.qishui.kotlinandroid

import android.os.Bundle
import mzict.com.myoa.mylibrary.base.BaseActivity
import mzict.com.myoa.mylibrary.utils.LogUtils


class MainActivity : BaseActivity() {

    override fun initLayout(): Int {
        return R.layout.activity_main
    }

    override fun initEvent(savedInstanceState: Bundle?) {

        LogUtils.e("1","2","100",123);

    }


}
