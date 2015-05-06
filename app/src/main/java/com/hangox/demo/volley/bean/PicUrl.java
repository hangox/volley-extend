
package com.hangox.demo.volley.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PicUrl {

    @SerializedName("thumbnail_pic")
    @Expose
    private String thumbnailPic;

    /**
     * 
     * @return
     *     The thumbnailPic
     */
    public String getThumbnailPic() {
        return thumbnailPic;
    }

    /**
     * 
     * @param thumbnailPic
     *     The thumbnail_pic
     */
    public void setThumbnailPic(String thumbnailPic) {
        this.thumbnailPic = thumbnailPic;
    }

}
