package com.jbk.validation;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.stereotype.Component;

import com.jbk.model.ProductModel;

@Component
public class ObjectValidation {

	public Map<String, String> validateProduct(ProductModel productModel) {

		Map<String, String> errorMap = new HashedMap<>();
		String productName = productModel.getProductName();
		double productPrice = productModel.getProductPrice();
		int productQty = productModel.getProductQty();
		String mfgDate = productModel.getMfgDate();
		String expDate = productModel.getExpDate();
		int deliveryCharges = productModel.getDeliveryCharges();
		long supplierId = productModel.getSupplier();
		long categoryId = productModel.getCategory();
		;

		if (productName == null || productName.trim().equals("")) {
			errorMap.put("Product Name", "Invalid product Name");
		}

		if (productPrice <= 0) {
			errorMap.put("Product Price", "Invalid Product Price");
		}

		if (productQty <= 0) {
			errorMap.put("Product Qty", "Invalid Product Qty");
		}

		if (mfgDate == null) {
			errorMap.put("Product MFG Date", "Invalid MFG Date");
		}

		if (expDate == null) {
			errorMap.put("Product EXP Date", "Invalid EXP Date");
		}

		if (deliveryCharges <= 0) {
			errorMap.put("Delivery Charges", "Invalid Delivery Charges");
		}

		if (supplierId <= 0) {
			errorMap.put("Supplier Id", "Invalid Supplier Id");
		}

		if (categoryId <= 0) {
			errorMap.put("Category Id", "Invalid Category Id");
		}

		return errorMap;
	}

}
