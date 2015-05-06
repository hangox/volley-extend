package com.hangox.demo.volley.parameter;

import com.hangox.volley.annotaion.ParamKey;
import com.hangox.volley.annotaion.Post;
import com.hangox.volley.request.RequestParam;

/**
 * Created With Android Studio
 * User hangox
 * Date 15/5/6
 * Time 下午6:08
 */
@Post(url = "https://api.weibo.com/oauth2/access_token",parser = String.class)
public class GetAccessTokenParam extends RequestParam<String> {
    @ParamKey("client_id")
    public String clientId;

    @ParamKey("client_secret")
    public String clientSecret;

    @ParamKey("grant_type")
    public String grantType  = "authorization_code";

    @ParamKey("code")
    public String code;

    @ParamKey("redirect_url")
    public String redirectUrl;



}
