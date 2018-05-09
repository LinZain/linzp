package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_oaq")
public class OaqRole {
	@Id
	@Column(name = "id")
	private String oaqId;
	
	@Column(name = "content_text")
	private String contentText;
	
	@Column(name = "forApp")
	private String forApp;

	public String getOaqId() {
		return oaqId;
	}

	public void setOaqId(String oaqId) {
		this.oaqId = oaqId;
	}

	public String getContentText() {
		return contentText;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	public String getForApp() {
		return forApp;
	}

	public void setForApp(String forApp) {
		this.forApp = forApp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contentText == null) ? 0 : contentText.hashCode());
		result = prime * result + ((forApp == null) ? 0 : forApp.hashCode());
		result = prime * result + ((oaqId == null) ? 0 : oaqId.hashCode());
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
		OaqRole other = (OaqRole) obj;
		if (contentText == null) {
			if (other.contentText != null)
				return false;
		} else if (!contentText.equals(other.contentText))
			return false;
		if (forApp == null) {
			if (other.forApp != null)
				return false;
		} else if (!forApp.equals(other.forApp))
			return false;
		if (oaqId == null) {
			if (other.oaqId != null)
				return false;
		} else if (!oaqId.equals(other.oaqId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OaqRole [oaqId=" + oaqId + ", contentText=" + contentText + ", forApp=" + forApp + "]";
	}
	
	

}
