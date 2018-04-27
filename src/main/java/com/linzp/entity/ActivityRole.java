package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_activity")
public class ActivityRole {

    @Id
    @Column(name = "act_id")
    private String actId;

    @Column(name = "act_time")
    private String actTime;

    @Column(name = "act_status")
    private String actStatus;

    @Column(name = "act_title")
    private String actTitle;

    @Column(name = "act_picUrl")
    private String actPicUrl;

    @Column(name = "act_content")
    private String actContent;

    @Column(name = "act_changeTime")
    private String actChangetime;

    @Column(name = "forApp")
    private String fromApp;

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getActTime() {
        return actTime;
    }

    public void setActTime(String actTime) {
        this.actTime = actTime;
    }

    public String getActStatus() {
        return actStatus;
    }

    public void setActStatus(String actStatus) {
        this.actStatus = actStatus;
    }

    public String getActTitle() {
        return actTitle;
    }

    public void setActTitle(String actTitle) {
        this.actTitle = actTitle;
    }

    public String getActPicUrl() {
        return actPicUrl;
    }

    public void setActPicUrl(String actPicUrl) {
        this.actPicUrl = actPicUrl;
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent;
    }

    public String getActChangetime() {
        return actChangetime;
    }

    public void setActChangetime(String actChangetime) {
        this.actChangetime = actChangetime;
    }

    public String getFromApp() {
        return fromApp;
    }

    public void setFromApp(String fromApp) {
        this.fromApp = fromApp;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((actChangetime == null) ? 0 : actChangetime.hashCode());
        result = prime * result + ((actContent == null) ? 0 : actContent.hashCode());
        result = prime * result + ((actId == null) ? 0 : actId.hashCode());
        result = prime * result + ((actPicUrl == null) ? 0 : actPicUrl.hashCode());
        result = prime * result + ((actStatus == null) ? 0 : actStatus.hashCode());
        result = prime * result + ((actTime == null) ? 0 : actTime.hashCode());
        result = prime * result + ((actTitle == null) ? 0 : actTitle.hashCode());
        result = prime * result + ((fromApp == null) ? 0 : fromApp.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ActivityRole other = (ActivityRole) obj;
        if (actChangetime == null) {
            if (other.actChangetime != null)
                return false;
        } else if (!actChangetime.equals(other.actChangetime))
            return false;
        if (actContent == null) {
            if (other.actContent != null)
                return false;
        } else if (!actContent.equals(other.actContent))
            return false;
        if (actId == null) {
            if (other.actId != null)
                return false;
        } else if (!actId.equals(other.actId))
            return false;
        if (actPicUrl == null) {
            if (other.actPicUrl != null)
                return false;
        } else if (!actPicUrl.equals(other.actPicUrl))
            return false;
        if (actStatus == null) {
            if (other.actStatus != null)
                return false;
        } else if (!actStatus.equals(other.actStatus))
            return false;
        if (actTime == null) {
            if (other.actTime != null)
                return false;
        } else if (!actTime.equals(other.actTime))
            return false;
        if (actTitle == null) {
            if (other.actTitle != null)
                return false;
        } else if (!actTitle.equals(other.actTitle))
            return false;
        if (fromApp == null) {
            if (other.fromApp != null)
                return false;
        } else if (!fromApp.equals(other.fromApp))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ActivityRole [actId=" + actId + ", actTime=" + actTime + ", actStatus=" + actStatus + ", actTitle=" + actTitle + ", actPicUrl=" + actPicUrl
                + ", actContent=" + actContent + ", actChangetime=" + actChangetime + ", fromApp=" + fromApp + "]";
    }

}
