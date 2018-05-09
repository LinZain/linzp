package com.linzp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order")
public class OrderRole {
	@Id
	@Column(name = "user_id")
	private String userId;

	@Column(name = "address_id")
	private String addressId;

	@Column(name = "total_price")
	private String totalPrice;

	@Column(name = "order_msg")
	private String orderMsg;

	@Column(name = "discount_price")
	private String discountPrice;

	@Column(name = "final_price")
	private String finalPrice;

	@Column(name = "order_source")
	private String orderSource;

	@Column(name = "merchants")
	private String merchants;

	@Column(name = "product_list")
	private String productList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderMsg() {
		return orderMsg;
	}

	public void setOrderMsg(String orderMsg) {
		this.orderMsg = orderMsg;
	}

	public String getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getMerchants() {
		return merchants;
	}

	public void setMerchants(String merchants) {
		this.merchants = merchants;
	}

	public String getProductList() {
		return productList;
	}

	public void setProductList(String productList) {
		this.productList = productList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressId == null) ? 0 : addressId.hashCode());
		result = prime * result + ((discountPrice == null) ? 0 : discountPrice.hashCode());
		result = prime * result + ((finalPrice == null) ? 0 : finalPrice.hashCode());
		result = prime * result + ((merchants == null) ? 0 : merchants.hashCode());
		result = prime * result + ((orderMsg == null) ? 0 : orderMsg.hashCode());
		result = prime * result + ((orderSource == null) ? 0 : orderSource.hashCode());
		result = prime * result + ((productList == null) ? 0 : productList.hashCode());
		result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
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
		OrderRole other = (OrderRole) obj;
		if (addressId == null) {
			if (other.addressId != null)
				return false;
		} else if (!addressId.equals(other.addressId))
			return false;
		if (discountPrice == null) {
			if (other.discountPrice != null)
				return false;
		} else if (!discountPrice.equals(other.discountPrice))
			return false;
		if (finalPrice == null) {
			if (other.finalPrice != null)
				return false;
		} else if (!finalPrice.equals(other.finalPrice))
			return false;
		if (merchants == null) {
			if (other.merchants != null)
				return false;
		} else if (!merchants.equals(other.merchants))
			return false;
		if (orderMsg == null) {
			if (other.orderMsg != null)
				return false;
		} else if (!orderMsg.equals(other.orderMsg))
			return false;
		if (orderSource == null) {
			if (other.orderSource != null)
				return false;
		} else if (!orderSource.equals(other.orderSource))
			return false;
		if (productList == null) {
			if (other.productList != null)
				return false;
		} else if (!productList.equals(other.productList))
			return false;
		if (totalPrice == null) {
			if (other.totalPrice != null)
				return false;
		} else if (!totalPrice.equals(other.totalPrice))
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
		return "OrderRole [userId=" + userId + ", addressId=" + addressId + ", totalPrice=" + totalPrice + ", orderMsg=" + orderMsg
				+ ", discountPrice=" + discountPrice + ", finalPrice=" + finalPrice + ", orderSource=" + orderSource + ", merchants="
				+ merchants + ", productList=" + productList + "]";
	}

}
