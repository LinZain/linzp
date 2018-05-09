package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_address")
public class AddressRole {

	@Id
	@Column(name = "add_id")
	private String addId;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "add_phone")
	private String addPhone;

	@Column(name = "add_name")
	private String addName;

	@Column(name = "is_default")
	private String isDefault;

	@Column(name = "address")
	private String address;

	@Column(name = "creat_time")
	private String creatTime;

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddPhone() {
		return addPhone;
	}

	public void setAddPhone(String addPhone) {
		this.addPhone = addPhone;
	}

	public String getAddName() {
		return addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addId == null) ? 0 : addId.hashCode());
		result = prime * result + ((addName == null) ? 0 : addName.hashCode());
		result = prime * result + ((addPhone == null) ? 0 : addPhone.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((creatTime == null) ? 0 : creatTime.hashCode());
		result = prime * result + ((isDefault == null) ? 0 : isDefault.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		AddressRole other = (AddressRole) obj;
		if (addId == null) {
			if (other.addId != null)
				return false;
		} else if (!addId.equals(other.addId))
			return false;
		if (addName == null) {
			if (other.addName != null)
				return false;
		} else if (!addName.equals(other.addName))
			return false;
		if (addPhone == null) {
			if (other.addPhone != null)
				return false;
		} else if (!addPhone.equals(other.addPhone))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (creatTime == null) {
			if (other.creatTime != null)
				return false;
		} else if (!creatTime.equals(other.creatTime))
			return false;
		if (isDefault == null) {
			if (other.isDefault != null)
				return false;
		} else if (!isDefault.equals(other.isDefault))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AddressRole [addId=" + addId + ", userId=" + userId + ", addPhone=" + addPhone + ", addName=" + addName + ", isDefault="
				+ isDefault + ", address=" + address + ", creatTime=" + creatTime + "]";
	}

}
