package com.hangox.demo.volley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.hangox.demo.volley.bean.Tab;
import com.hangox.demo.volley.bean.WeiboPublic;
import com.hangox.demo.volley.config.WeiboConfig;
import com.hangox.demo.volley.parameter.GetAccessTokenParam;
import com.hangox.demo.volley.parameter.GetCategoryParam;
import com.hangox.demo.volley.parameter.WeiboPublicParam;
import com.hangox.volley.http.RequestManager;
import com.hangox.volley.request.OnCompletedListener;
import com.hangox.volley.request.RequestParam;
import com.hangox.xlog.XLog;

import butterknife.ButterKnife;
import butterknife.InjectView;


/**
 * @author 47
 * Date 2015/4/6
 * 主要显示页面
 */
public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.linearLayout)
    LinearLayout layout;
    Response.Listener<String> stringListener = new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {
            XLog.i(response);
        }
    } ;
    Response.Listener listener = new Response.Listener<WeiboPublic>(){

        @Override
        public void onResponse(WeiboPublic response) {
            XLog.d(new Gson().toJson(response));
        }
    };
    Response.ErrorListener errorListener = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            if (error != null)
            XLog.i(error.toString()+error.getLocalizedMessage());
        }
    };

    OnCompletedListener onCompletedListener = new OnCompletedListener() {
        @Override
        public void onRequestCompleted(boolean isSuccess) {
            XLog.i(isSuccess);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        addButton("获取token").setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetAccessTokenParam param = new GetAccessTokenParam();
                setListener(param);
                param.listener = stringListener;
                param.clientId = "3891613265";
                param.clientSecret = "f734c232d072c780548cd4c804244f51";
                param.code = "f1abf478ce1b697a381a7f31276a1cd6";
                param.redirectUrl = "https://api.weibo.com/oauth2/default.html";
                RequestManager.addRequest(param);
            }
        });
        addButton("Get获取微博公共接口").setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeiboPublicParam param = new WeiboPublicParam();
                param.source = WeiboConfig.APP_KEY;
                param.accessToken= WeiboConfig.ACCESS_TOKEN;
                setListener(param);
                param.listener = listener;
                RequestManager.addRequest(param);
            }
        });
        addButton("其他地址").setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetCategoryParam param = new GetCategoryParam();
                setListener(param);
                param.listener = new Response.Listener<Tab>() {
                    @Override
                    public void onResponse(Tab response) {
                        XLog.i(response.getList().get(0).getName());
                    }
                };
                RequestManager.addRequest(param);
            }
        });
    }

    private void setListener(RequestParam param){
        param.errorListener = errorListener;
        param.onCompletedListener = onCompletedListener;
    }


    private Button addButton(String name){
        Button button = new Button(this);
        button.setText(name);
        button.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.addView(button);
        return button;
    }
}
