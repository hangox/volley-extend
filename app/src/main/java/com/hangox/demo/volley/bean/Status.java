
package com.hangox.demo.volley.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Status {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @Expose
    private Long id;
    @Expose
    private String mid;
    @Expose
    private String idstr;
    @Expose
    private String text;
    @SerializedName("source_allowclick")
    @Expose
    private Long sourceAllowclick;
    @SerializedName("source_type")
    @Expose
    private Long sourceType;
    @Expose
    private String source;
    @Expose
    private Boolean favorited;
    @Expose
    private Boolean truncated;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private String inReplyToStatusId;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private String inReplyToUserId;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private String inReplyToScreenName;
    @SerializedName("pic_urls")
    @Expose
    private List<PicUrl> picUrls = new ArrayList<PicUrl>();
    @SerializedName("thumbnail_pic")
    @Expose
    private String thumbnailPic;
    @SerializedName("bmiddle_pic")
    @Expose
    private String bmiddlePic;
    @SerializedName("original_pic")
    @Expose
    private String originalPic;
    @Expose
    private Object geo;
    @Expose
    private User user;
    @SerializedName("reposts_count")
    @Expose
    private Long repostsCount;
    @SerializedName("comments_count")
    @Expose
    private Long commentsCount;
    @SerializedName("attitudes_count")
    @Expose
    private Long attitudesCount;
    @Expose
    private Long mlevel;
    @Expose
    private Visible visible;
    @SerializedName("darwin_tags")
    @Expose
    private List<Object> darwinTags = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * 
     * @param mid
     *     The mid
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 
     * @return
     *     The idstr
     */
    public String getIdstr() {
        return idstr;
    }

    /**
     * 
     * @param idstr
     *     The idstr
     */
    public void setIdstr(String idstr) {
        this.idstr = idstr;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The sourceAllowclick
     */
    public Long getSourceAllowclick() {
        return sourceAllowclick;
    }

    /**
     * 
     * @param sourceAllowclick
     *     The source_allowclick
     */
    public void setSourceAllowclick(Long sourceAllowclick) {
        this.sourceAllowclick = sourceAllowclick;
    }

    /**
     * 
     * @return
     *     The sourceType
     */
    public Long getSourceType() {
        return sourceType;
    }

    /**
     * 
     * @param sourceType
     *     The source_type
     */
    public void setSourceType(Long sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The favorited
     */
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * 
     * @param favorited
     *     The favorited
     */
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * 
     * @return
     *     The truncated
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * 
     * @param truncated
     *     The truncated
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * 
     * @return
     *     The inReplyToStatusId
     */
    public String getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     * 
     * @param inReplyToStatusId
     *     The in_reply_to_status_id
     */
    public void setInReplyToStatusId(String inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    /**
     * 
     * @return
     *     The inReplyToUserId
     */
    public String getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     * 
     * @param inReplyToUserId
     *     The in_reply_to_user_id
     */
    public void setInReplyToUserId(String inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     * 
     * @return
     *     The inReplyToScreenName
     */
    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     * 
     * @param inReplyToScreenName
     *     The in_reply_to_screen_name
     */
    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     * 
     * @return
     *     The picUrls
     */
    public List<PicUrl> getPicUrls() {
        return picUrls;
    }

    /**
     * 
     * @param picUrls
     *     The pic_urls
     */
    public void setPicUrls(List<PicUrl> picUrls) {
        this.picUrls = picUrls;
    }

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

    /**
     * 
     * @return
     *     The bmiddlePic
     */
    public String getBmiddlePic() {
        return bmiddlePic;
    }

    /**
     * 
     * @param bmiddlePic
     *     The bmiddle_pic
     */
    public void setBmiddlePic(String bmiddlePic) {
        this.bmiddlePic = bmiddlePic;
    }

    /**
     * 
     * @return
     *     The originalPic
     */
    public String getOriginalPic() {
        return originalPic;
    }

    /**
     * 
     * @param originalPic
     *     The original_pic
     */
    public void setOriginalPic(String originalPic) {
        this.originalPic = originalPic;
    }

    /**
     * 
     * @return
     *     The geo
     */
    public Object getGeo() {
        return geo;
    }

    /**
     * 
     * @param geo
     *     The geo
     */
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     * 
     * @return
     *     The user
     */
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The repostsCount
     */
    public Long getRepostsCount() {
        return repostsCount;
    }

    /**
     * 
     * @param repostsCount
     *     The reposts_count
     */
    public void setRepostsCount(Long repostsCount) {
        this.repostsCount = repostsCount;
    }

    /**
     * 
     * @return
     *     The commentsCount
     */
    public Long getCommentsCount() {
        return commentsCount;
    }

    /**
     * 
     * @param commentsCount
     *     The comments_count
     */
    public void setCommentsCount(Long commentsCount) {
        this.commentsCount = commentsCount;
    }

    /**
     * 
     * @return
     *     The attitudesCount
     */
    public Long getAttitudesCount() {
        return attitudesCount;
    }

    /**
     * 
     * @param attitudesCount
     *     The attitudes_count
     */
    public void setAttitudesCount(Long attitudesCount) {
        this.attitudesCount = attitudesCount;
    }

    /**
     * 
     * @return
     *     The mlevel
     */
    public Long getMlevel() {
        return mlevel;
    }

    /**
     * 
     * @param mlevel
     *     The mlevel
     */
    public void setMlevel(Long mlevel) {
        this.mlevel = mlevel;
    }

    /**
     * 
     * @return
     *     The visible
     */
    public Visible getVisible() {
        return visible;
    }

    /**
     * 
     * @param visible
     *     The visible
     */
    public void setVisible(Visible visible) {
        this.visible = visible;
    }

    /**
     * 
     * @return
     *     The darwinTags
     */
    public List<Object> getDarwinTags() {
        return darwinTags;
    }

    /**
     * 
     * @param darwinTags
     *     The darwin_tags
     */
    public void setDarwinTags(List<Object> darwinTags) {
        this.darwinTags = darwinTags;
    }

}
