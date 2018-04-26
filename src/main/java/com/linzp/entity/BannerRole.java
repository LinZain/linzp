package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bannner")
public class BannerRole {
	@Id
	@Column(name = "banner_id")
	private String bannerId;

	@Column(name = "banner_picUrl")
	private String bannerPicUrl;

	@Column(name = "banner_title")
	private String bannerTitle;

	@Column(name = "banner_tartgetUrl")
	private String bannerTartgetUrl;

	@Column(name = "banner_status")
	private String bannerStatus;

	@Column(name = "banner_forApp")
	private String bannerForApp;

	public String getBannerId() {
		return bannerId;
	}

	public void setBannerId(String bannerId) {
		this.bannerId = bannerId;
	}

	public String getBannerPicUrl() {
		return bannerPicUrl;
	}

	public void setBannerPicUrl(String bannerPicUrl) {
		this.bannerPicUrl = bannerPicUrl;
	}

	public String getBannerTitle() {
		return bannerTitle;
	}

	public void setBannerTitle(String bannerTitle) {
		this.bannerTitle = bannerTitle;
	}

	public String getBannerTartgetUrl() {
		return bannerTartgetUrl;
	}

	public void setBannerTartgetUrl(String bannerTartgetUrl) {
		this.bannerTartgetUrl = bannerTartgetUrl;
	}

	public String getBannerStatus() {
		return bannerStatus;
	}

	public void setBannerStatus(String bannerStatus) {
		this.bannerStatus = bannerStatus;
	}

	public String getBannerForApp() {
		return bannerForApp;
	}

	public void setBannerForApp(String bannerForApp) {
		this.bannerForApp = bannerForApp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bannerForApp == null) ? 0 : bannerForApp.hashCode());
		result = prime * result + ((bannerId == null) ? 0 : bannerId.hashCode());
		result = prime * result + ((bannerPicUrl == null) ? 0 : bannerPicUrl.hashCode());
		result = prime * result + ((bannerStatus == null) ? 0 : bannerStatus.hashCode());
		result = prime * result + ((bannerTartgetUrl == null) ? 0 : bannerTartgetUrl.hashCode());
		result = prime * result + ((bannerTitle == null) ? 0 : bannerTitle.hashCode());
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
		BannerRole other = (BannerRole) obj;
		if (bannerForApp == null) {
			if (other.bannerForApp != null)
				return false;
		} else if (!bannerForApp.equals(other.bannerForApp))
			return false;
		if (bannerId == null) {
			if (other.bannerId != null)
				return false;
		} else if (!bannerId.equals(other.bannerId))
			return false;
		if (bannerPicUrl == null) {
			if (other.bannerPicUrl != null)
				return false;
		} else if (!bannerPicUrl.equals(other.bannerPicUrl))
			return false;
		if (bannerStatus == null) {
			if (other.bannerStatus != null)
				return false;
		} else if (!bannerStatus.equals(other.bannerStatus))
			return false;
		if (bannerTartgetUrl == null) {
			if (other.bannerTartgetUrl != null)
				return false;
		} else if (!bannerTartgetUrl.equals(other.bannerTartgetUrl))
			return false;
		if (bannerTitle == null) {
			if (other.bannerTitle != null)
				return false;
		} else if (!bannerTitle.equals(other.bannerTitle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BannerRole [bannerId=" + bannerId + ", bannerPicUrl=" + bannerPicUrl + ", bannerTitle=" + bannerTitle
				+ ", bannerTartgetUrl=" + bannerTartgetUrl + ", bannerStatus=" + bannerStatus + ", bannerForApp=" + bannerForApp + "]";
	}

}
