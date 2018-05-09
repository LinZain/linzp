package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class UserRole {

	@Id
	@Column(name = "user_id")
	private int userId;

	@Column(name = "to_id")
	private int toId;

	@Column(name = "login_name")
	private int loginName;

	@Column(name = "password")
	private int password;

	@Column(name = "nick_name")
	private int nickName;

	@Column(name = "real_name")
	private int realName;

	@Column(name = "mobile")
	private int mobile;

	@Column(name = "email")
	private int email;

	@Column(name = "gen_time")
	private int genTime;

	@Column(name = "login_time")
	private int loginTime;

	@Column(name = "count")
	private int count;

	@Column(name = "source")
	private int source;

	@Column(name = "address")
	private int address;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getToId() {
		return toId;
	}

	public void setToId(int toId) {
		this.toId = toId;
	}

	public int getLoginName() {
		return loginName;
	}

	public void setLoginName(int loginName) {
		this.loginName = loginName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getNickName() {
		return nickName;
	}

	public void setNickName(int nickName) {
		this.nickName = nickName;
	}

	public int getRealName() {
		return realName;
	}

	public void setRealName(int realName) {
		this.realName = realName;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public int getGenTime() {
		return genTime;
	}

	public void setGenTime(int genTime) {
		this.genTime = genTime;
	}

	public int getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(int loginTime) {
		this.loginTime = loginTime;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + address;
		result = prime * result + count;
		result = prime * result + email;
		result = prime * result + genTime;
		result = prime * result + loginName;
		result = prime * result + loginTime;
		result = prime * result + mobile;
		result = prime * result + nickName;
		result = prime * result + password;
		result = prime * result + realName;
		result = prime * result + source;
		result = prime * result + toId;
		result = prime * result + userId;
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
		UserRole other = (UserRole) obj;
		if (address != other.address)
			return false;
		if (count != other.count)
			return false;
		if (email != other.email)
			return false;
		if (genTime != other.genTime)
			return false;
		if (loginName != other.loginName)
			return false;
		if (loginTime != other.loginTime)
			return false;
		if (mobile != other.mobile)
			return false;
		if (nickName != other.nickName)
			return false;
		if (password != other.password)
			return false;
		if (realName != other.realName)
			return false;
		if (source != other.source)
			return false;
		if (toId != other.toId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserRole [userId=" + userId + ", toId=" + toId + ", loginName=" + loginName + ", password=" + password + ", nickName="
				+ nickName + ", realName=" + realName + ", mobile=" + mobile + ", email=" + email + ", genTime=" + genTime + ", loginTime="
				+ loginTime + ", count=" + count + ", source=" + source + ", address=" + address + "]";
	}

}
