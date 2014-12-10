package com.hangox.volleyextend;

import android.content.Context;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;


/**
 * Created With Android Studio
 * User Auggie Liang
 * Date 13-12-2
 * Time 下午3:26
 * 默认的错误处理器
 */
public class DefaultErrorListener implements Response.ErrorListener {
    public static final String TAG = DefaultErrorListener.class.getSimpleName();

    private Context context;
    private boolean isShowTip = true;
    private Response.ErrorListener errorListener;

    public DefaultErrorListener(Context context){
        this.context = context;
    }

    /**
     * 是否显示错误
     * @param isShowTip
     * @return
     */
    public DefaultErrorListener showTip(boolean isShowTip){
        this.isShowTip = isShowTip;
        return this;
    }

    /**
     * 可以自定义错误
     * @param errorListener
     * @return
     */
    public DefaultErrorListener setErrorListener(Response.ErrorListener errorListener){
        this.errorListener = errorListener;
        return this;
    }

    @Override
    public void onErrorResponse(VolleyError volleyError) {
        if(errorListener != null ) errorListener.onErrorResponse(volleyError);
        Log.e(TAG,"volleyErrorCode" + volleyError.networkResponse.statusCode);
    }
}
