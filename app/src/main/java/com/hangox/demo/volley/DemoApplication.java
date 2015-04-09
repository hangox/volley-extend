package com.hangox.demo.volley;

import android.app.Application;

import com.hangox.volley.RequestManager;

/**
 * Created With Android Studio
 * User hangox
 * Date 15/4/9
 * Time 下午3:10
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化请求管理器
        RequestManager.init(this);
    }
}
