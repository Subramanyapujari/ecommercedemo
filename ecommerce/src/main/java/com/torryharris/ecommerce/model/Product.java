package com.torryharris.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	int productId;
	String productName;
	String productDesc;
	int price;
	int stock;
	int catId;
	int supplierId;
	
	public Product() {
	}

	public Product(int productId, String productName, String productDesc, int price, int stock, int catId,
			int supplierId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
		this.stock = stock;
		this.catId = catId;
		this.supplierId = supplierId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", price=" + price + ", stock=" + stock + ", catId=" + catId + ", supplierId=" + supplierId + "]";
	}
	
}
