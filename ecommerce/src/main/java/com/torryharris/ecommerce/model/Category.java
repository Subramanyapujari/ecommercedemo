package com.torryharris.ecommerce.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue
	private int catId;
	private String catName;
	private String catDesc;
	
	
	
	public Category() {
	}

	public Category(int catId, String catName, String catDesc) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.catDesc = catDesc;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + ", catDesc=" + catDesc + "]";
	}
	
	
	

}
