package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_groupList")
public class GroupRole {
    @Id
    @Column(name = "group_id")
    private String groupId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "group_picUrl")
    private String groupPicUrl;

    @Column(name = "forApp")
    private String forApp;

    @Column(name = "group_status")
    private String groupStatus;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupPicUrl() {
        return groupPicUrl;
    }

    public void setGroupPicUrl(String groupPicUrl) {
        this.groupPicUrl = groupPicUrl;
    }

    public String getForApp() {
        return forApp;
    }

    public void setForApp(String forApp) {
        this.forApp = forApp;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((forApp == null) ? 0 : forApp.hashCode());
        result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
        result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
        result = prime * result + ((groupPicUrl == null) ? 0 : groupPicUrl.hashCode());
        result = prime * result + ((groupStatus == null) ? 0 : groupStatus.hashCode());
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
        GroupRole other = (GroupRole) obj;
        if (forApp == null) {
            if (other.forApp != null)
                return false;
        } else if (!forApp.equals(other.forApp))
            return false;
        if (groupId == null) {
            if (other.groupId != null)
                return false;
        } else if (!groupId.equals(other.groupId))
            return false;
        if (groupName == null) {
            if (other.groupName != null)
                return false;
        } else if (!groupName.equals(other.groupName))
            return false;
        if (groupPicUrl == null) {
            if (other.groupPicUrl != null)
                return false;
        } else if (!groupPicUrl.equals(other.groupPicUrl))
            return false;
        if (groupStatus == null) {
            if (other.groupStatus != null)
                return false;
        } else if (!groupStatus.equals(other.groupStatus))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "GroupRole [groupId=" + groupId + ", groupName=" + groupName + ", groupPicUrl=" + groupPicUrl + ", forApp=" + forApp + ", groupStatus="
                + groupStatus + "]";
    }

}
