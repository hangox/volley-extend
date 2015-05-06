package com.hangox.demo.volley.parameter;

import com.hangox.demo.volley.bean.WeiboPublic;
import com.hangox.volley.annotaion.Get;
import com.hangox.volley.annotaion.ParamKey;
import com.hangox.volley.request.RequestParam;

/**
 * Created With Android Studio
 * User hangox
 * Date 15/4/13
 * Time 下午2:44
 */

@Get(url = "/2/statuses/public_timeline.json",parser = WeiboPublic.class)
public class WeiboPublicParam extends RequestParam <WeiboPublic>{
    @ParamKey("source")
    public String source;

    @ParamKey("access_token")
    public String accessToken;

}
