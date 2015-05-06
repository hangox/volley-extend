
package com.hangox.demo.volley.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Visible {

    @Expose
    private Long type;
    @SerializedName("list_id")
    @Expose
    private Long listId;

    /**
     * 
     * @return
     *     The type
     */
    public Long getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The listId
     */
    public Long getListId() {
        return listId;
    }

    /**
     * 
     * @param listId
     *     The list_id
     */
    public void setListId(Long listId) {
        this.listId = listId;
    }

}
