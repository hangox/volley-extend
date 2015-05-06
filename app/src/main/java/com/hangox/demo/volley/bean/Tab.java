
package com.hangox.demo.volley.bean;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;


public class Tab extends SuperBean{


    @Expose
    private java.util.List<com.hangox.demo.volley.bean.List> list = new ArrayList<com.hangox.demo.volley.bean.List>();
    @Expose
    private String msg;





    /**
     * 
     * @return
     *     The list
     */
    public java.util.List<com.hangox.demo.volley.bean.List> getList() {
        return list;
    }

    /**
     * 
     * @param list
     *     The list
     */
    public void setList(java.util.List<com.hangox.demo.volley.bean.List> list) {
        this.list = list;
    }

    /**
     * 
     * @return
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
