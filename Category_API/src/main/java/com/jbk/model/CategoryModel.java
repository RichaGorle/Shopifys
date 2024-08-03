package com.jbk.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class CategoryModel {

	@Min(value = 1,  message = "Invalid Category Id")
	private long categoryId;
	
	@Pattern(regexp = "^[A-Za-z]+\\s+[A-Za-z]+$", message = "Invalid Category Name")
	private String categoryName;
	
	@Pattern(regexp = "^[A-Za-z]+\\s+[A-Za-z]+$", message = "Invalid Description")
	private String description;
	
	@Min(value = 1,  message = "Invalid Discount")
	private int discount;
	
	@Min(value = 1,  message = "Invalid GST")
	private int gst;  
	
	@Min(value = 1,  message = "Invalid Charges")
	private double deliveryChargesAmount;
	
	public CategoryModel() {
		// TODO Auto-generated constructor stub
	}

	public CategoryModel(long categoryId, String categoryName, String description, int discount, int gst,double deliveryChargesAmount) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
		this.discount = discount;
		this.gst = gst;
		this.deliveryChargesAmount=deliveryChargesAmount;
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
