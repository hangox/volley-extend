package com.hangox.demo.volley.bean;

import com.google.gson.annotations.SerializedName;
import com.hangox.volley.Judgeable;

/**
 * Created With Android Studio
 * User hangox
 * Date 15/5/6
 * Time 上午10:59
 * 所有外城访问的父类
 */
public class SuperBean implements Judgeable {
    public String error;
    @SerializedName("error_code")
    public int errorCode;
    @Override
    public boolean isSuccess() {
        return errorCode == 0;
    }

    @Override
    public int getResultCode() {
        return errorCode;
    }

    @Override
    public String getResultMessage() {
        return error;
    }
}
