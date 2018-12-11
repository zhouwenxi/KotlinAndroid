package mzict.com.myoa.mylibrary.notice

import android.widget.Toast
import mzict.com.myoa.mylibrary.app.BaseApplication

class ToastUtils{

    companion object {

        fun short(msg:String){
            Toast.makeText(BaseApplication.context,msg,Toast.LENGTH_SHORT).show();
        }

    }
}