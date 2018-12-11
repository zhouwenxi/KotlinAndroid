package mzict.com.myoa.mylibrary.utils

import android.os.Parcelable
import com.tencent.mmkv.MMKV

class SpUtils {

    companion object {
        var kv = MMKV.defaultMMKV();

        fun put(key: String, value: Any) {

            if (value is String) {
                kv.encode(key, value)
            } else if (value is Int) {
                kv.encode(key, value)
            } else if (value is Double) {
                kv.encode(key, value)
            } else if (value is Float) {
                kv.encode(key, value)
            } else if (value is Long) {
                kv.encode(key, value)
            } else if (value is Boolean) {
                kv.encode(key, value)
            } else if (value is ByteArray) {
                kv.encode(key, value)
            } else if (value is Parcelable) {
                kv.encode(key, value)
            } else {
                kv.encode(key, "" + value);
            }
        }
    }


}

