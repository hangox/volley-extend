package com.hangox.demo.volley.parameter;

import com.hangox.demo.volley.bean.Tab;
import com.hangox.volley.annotaion.Get;
import com.hangox.volley.request.RequestParam;

/**
 * Created With Android Studio
 * User hangox
 * Date 15/5/6
 * Time 下午9:27
 */
@Get(url = "http://www.kyy920.com/kyy/info/getCategory.action", parser = Tab.class)
public class GetCategoryParam extends RequestParam<Tab> {
}
