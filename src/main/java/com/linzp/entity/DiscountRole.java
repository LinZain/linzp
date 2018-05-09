package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_discount")
public class DiscountRole {
	@Id
	@Column(name = "discount_code")
	private String discountCode;

	@Column(name = "discount_price")
	private String discountPrice;

	@Column(name = "forApp")
	private String fromApp;

	@Column(name = "use_threshold")
	private String useThreshold;

	@Column(name = "use_date")
	private String useDate;

	@Column(name = "discount_text")
	private String discountText;

	@Column(name = "code_inventory")
	private String codeInventory;

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getFromApp() {
		return fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
	}

	public String getUseThreshold() {
		return useThreshold;
	}

	public void setUseThreshold(String useThreshold) {
		this.useThreshold = useThreshold;
	}

	public String getUseDate() {
		return useDate;
	}

	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

	public String getDiscountText() {
		return discountText;
	}

	public void setDiscountText(String discountText) {
		this.discountText = discountText;
	}

	public String getCodeInventory() {
		return codeInventory;
	}

	public void setCodeInventory(String codeInventory) {
		this.codeInventory = codeInventory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeInventory == null) ? 0 : codeInventory.hashCode());
		result = prime * result + ((discountCode == null) ? 0 : discountCode.hashCode());
		result = prime * result + ((discountPrice == null) ? 0 : discountPrice.hashCode());
		result = prime * result + ((discountText == null) ? 0 : discountText.hashCode());
		result = prime * result + ((fromApp == null) ? 0 : fromApp.hashCode());
		result = prime * result + ((useDate == null) ? 0 : useDate.hashCode());
		result = prime * result + ((useThreshold == null) ? 0 : useThreshold.hashCode());
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
		DiscountRole other = (DiscountRole) obj;
		if (codeInventory == null) {
			if (other.codeInventory != null)
				return false;
		} else if (!codeInventory.equals(other.codeInventory))
			return false;
		if (discountCode == null) {
			if (other.discountCode != null)
				return false;
		} else if (!discountCode.equals(other.discountCode))
			return false;
		if (discountPrice == null) {
			if (other.discountPrice != null)
				return false;
		} else if (!discountPrice.equals(other.discountPrice))
			return false;
		if (discountText == null) {
			if (other.discountText != null)
				return false;
		} else if (!discountText.equals(other.discountText))
			return false;
		if (fromApp == null) {
			if (other.fromApp != null)
				return false;
		} else if (!fromApp.equals(other.fromApp))
			return false;
		if (useDate == null) {
			if (other.useDate != null)
				return false;
		} else if (!useDate.equals(other.useDate))
			return false;
		if (useThreshold == null) {
			if (other.useThreshold != null)
				return false;
		} else if (!useThreshold.equals(other.useThreshold))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DiscountRole [discountCode=" + discountCode + ", discountPrice=" + discountPrice + ", fromApp=" + fromApp
				+ ", useThreshold=" + useThreshold + ", useDate=" + useDate + ", discountText=" + discountText + ", codeInventory="
				+ codeInventory + "]";
	}

}
