package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	private long productId;

	@Column(nullable = false, unique = true)
	private String productName;

	private long supplier;

	private long category;

	@Column(nullable = false, unique = false)
	private int productQty;

	@Column(nullable = false, unique = false)
	private double productPrice;

	@Column(nullable = false)
	private String mfgDate;

	@Column(nullable = false)
	private String expDate;

	@Column(nullable = false)
	private int deliveryCharges;

	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(long productId, String productName, long supplier, long category, int productQty,
			double productPrice, String mfgDate, String expDate, int deliveryCharges) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.supplier = supplier;
		this.category = category;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.deliveryCharges = deliveryCharges;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getSupplier() {
		return supplier;
	}

	public void setSupplier(long supplier) {
		this.supplier = supplier;
	}

	public long getCategory() {
		return category;
	}

	public void setCategory(long category) {
		this.category = category;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(int deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", supplierId=" + supplier
				+ ", categoryId=" + category + ", productQty=" + productQty + ", productPrice=" + productPrice
				+ ", mfgDate=" + mfgDate + ", expDate=" + expDate + ", deliveryCharges=" + deliveryCharges + "]";
	}

}
