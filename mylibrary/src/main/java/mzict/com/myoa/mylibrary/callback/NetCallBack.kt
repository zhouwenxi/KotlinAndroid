package mzict.com.myoa.mylibrary.callback


/**
 * 网络回调
 */
interface NetCallBack<T> {

    /**
     * 开始请求
     */
    fun onStart()

    /**
     * 请求成功
     */
    fun onSuccess(t:T)

    /**
     * 请求失败
     */
    fun onFail(msg:String)

    /**
     * 请求失败成功都调用
     */
    fun onEnd()
}