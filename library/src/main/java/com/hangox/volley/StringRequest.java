package com.hangox.volley;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

/**
 * Created With Android Studio
 * User hangox
 * Date 15/4/9
 * Time 下午4:50
 */
public class StringRequest extends Request<String> {
    public StringRequest(int method, String url,
                         Response.Listener<String> listener,

                         Response.ErrorListener errorListener) {
        super(method, url, errorListener);
    }

    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    @Override
    protected void deliverResponse(String response) {

    }
}
