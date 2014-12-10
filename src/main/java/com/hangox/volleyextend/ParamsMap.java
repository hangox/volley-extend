package com.hangox.volleyextend;

import java.util.HashMap;
import java.util.Map;

/**
 * Created With Android Studio
 * User Auggie Liang
 * Date 13-12-6
 * Time 下午4:00
 * 参数MAP
 */
public class ParamsMap  {

    private Map<String,String> mParams = new HashMap<String, String>();

    public void putAll(Map<String,String> map){
            mParams.putAll(map);
    }
    public ParamsMap put(String key,String value){
        mParams.put(key,value);
        return this;
    }

    public ParamsMap put(String key,int value){
        mParams.put(key,value+"");
        return this;
    }

    public ParamsMap put(String key,long value){
        mParams.put(key,value+"");
        return this;
    }


    public ParamsMap put(String key,float value){
        mParams.put(key,value+"");
        return this;
    }

    public ParamsMap put(String key,double value){
        mParams.put(key,value+"");
        return this;
    }
    public Map<String,String> getMap(){
        return mParams;
    }

    public void putAll(Object... key_value){
        if(key_value.length % 2 != 0 ) return;
        for(int i = 0 ;i < key_value.length ; i =+ 2)
            put(key_value[i].toString(),key_value[i+1].toString());
    }

}
