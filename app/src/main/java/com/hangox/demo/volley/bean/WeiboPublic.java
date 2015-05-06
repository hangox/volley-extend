
package com.hangox.demo.volley.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class WeiboPublic extends SuperBean{

    @Expose
    private List<Status> statuses = new ArrayList<Status>();
    @Expose
    private Boolean hasvisible;
    @SerializedName("previous_cursor")
    @Expose
    private Long previousCursor;
    @SerializedName("next_cursor")
    @Expose
    private Long nextCursor;
    @SerializedName("total_number")
    @Expose
    private Long totalNumber;
    @Expose
    private Long interval;

    /**
     * 
     * @return
     *     The statuses
     */
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     * 
     * @param statuses
     *     The statuses
     */
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    /**
     * 
     * @return
     *     The hasvisible
     */
    public Boolean getHasvisible() {
        return hasvisible;
    }

    /**
     * 
     * @param hasvisible
     *     The hasvisible
     */
    public void setHasvisible(Boolean hasvisible) {
        this.hasvisible = hasvisible;
    }

    /**
     * 
     * @return
     *     The previousCursor
     */
    public Long getPreviousCursor() {
        return previousCursor;
    }

    /**
     * 
     * @param previousCursor
     *     The previous_cursor
     */
    public void setPreviousCursor(Long previousCursor) {
        this.previousCursor = previousCursor;
    }

    /**
     * 
     * @return
     *     The nextCursor
     */
    public Long getNextCursor() {
        return nextCursor;
    }

    /**
     * 
     * @param nextCursor
     *     The next_cursor
     */
    public void setNextCursor(Long nextCursor) {
        this.nextCursor = nextCursor;
    }

    /**
     * 
     * @return
     *     The totalNumber
     */
    public Long getTotalNumber() {
        return totalNumber;
    }

    /**
     * 
     * @param totalNumber
     *     The total_number
     */
    public void setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * 
     * @return
     *     The interval
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * 
     * @param interval
     *     The interval
     */
    public void setInterval(Long interval) {
        this.interval = interval;
    }

}
