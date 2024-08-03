package com.jbk.model;

public class CategoryModel {

	private long categoryId;

	private String categoryName;

	private String description;

	private int discount;

	private int gst;

	private double deliveryChargesAmount;

	public CategoryModel() {
		// TODO Auto-generated constructor stub
	}

	public CategoryModel(long categoryId, String categoryName, String description, int discount, int gst,
			double deliveryChargesAmount) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
		this.discount = discount;
		this.gst = gst;
		this.deliveryChargesAmount = deliveryChargesAmount;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public double getDeliveryChargesAmount() {
		return deliveryChargesAmount;
	}

	public void setDeliveryChargesAmount(double deliveryChargesAmount) {
		this.deliveryChargesAmount = deliveryChargesAmount;
	}

	@Override
	public String toString() {
		return "CategoryModel [categoryId=" + categoryId + ", categoryName=" + categoryName + ", description="
				+ description + ", discount=" + discount + ", gst=" + gst + ", deliveryChargesAmount="
				+ deliveryChargesAmount + "]";
	}

}
