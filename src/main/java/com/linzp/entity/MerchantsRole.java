package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_merchants")
public class MerchantsRole {
	@Id
	@Column(name = "merchants_id")
	private String merchantsId;

	@Column(name = "merchants_QRcode")
	private String merchantsQRcode;

	@Column(name = "merchants_introduce")
	private String merchantsIntroduce;

	@Column(name = "merchants_contact")
	private String merchantsContact;

	@Column(name = "forApp")
	private String forApp;

	public String getMerchantsId() {
		return merchantsId;
	}

	public void setMerchantsId(String merchantsId) {
		this.merchantsId = merchantsId;
	}

	public String getMerchantsQRcode() {
		return merchantsQRcode;
	}

	public void setMerchantsQRcode(String merchantsQRcode) {
		this.merchantsQRcode = merchantsQRcode;
	}

	public String getMerchantsIntroduce() {
		return merchantsIntroduce;
	}

	public void setMerchantsIntroduce(String merchantsIntroduce) {
		this.merchantsIntroduce = merchantsIntroduce;
	}

	public String getMerchantsContact() {
		return merchantsContact;
	}

	public void setMerchantsContact(String merchantsContact) {
		this.merchantsContact = merchantsContact;
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
		result = prime * result + ((forApp == null) ? 0 : forApp.hashCode());
		result = prime * result + ((merchantsContact == null) ? 0 : merchantsContact.hashCode());
		result = prime * result + ((merchantsId == null) ? 0 : merchantsId.hashCode());
		result = prime * result + ((merchantsIntroduce == null) ? 0 : merchantsIntroduce.hashCode());
		result = prime * result + ((merchantsQRcode == null) ? 0 : merchantsQRcode.hashCode());
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
		MerchantsRole other = (MerchantsRole) obj;
		if (forApp == null) {
			if (other.forApp != null)
				return false;
		} else if (!forApp.equals(other.forApp))
			return false;
		if (merchantsContact == null) {
			if (other.merchantsContact != null)
				return false;
		} else if (!merchantsContact.equals(other.merchantsContact))
			return false;
		if (merchantsId == null) {
			if (other.merchantsId != null)
				return false;
		} else if (!merchantsId.equals(other.merchantsId))
			return false;
		if (merchantsIntroduce == null) {
			if (other.merchantsIntroduce != null)
				return false;
		} else if (!merchantsIntroduce.equals(other.merchantsIntroduce))
			return false;
		if (merchantsQRcode == null) {
			if (other.merchantsQRcode != null)
				return false;
		} else if (!merchantsQRcode.equals(other.merchantsQRcode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MerchantsRole [merchantsId=" + merchantsId + ", merchantsQRcode=" + merchantsQRcode + ", merchantsIntroduce="
				+ merchantsIntroduce + ", merchantsContact=" + merchantsContact + ", forApp=" + forApp + "]";
	}

}
