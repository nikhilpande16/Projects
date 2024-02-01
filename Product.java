package com.product;

public class Product {
	
	private String productName ;
	private double productOrginalPrice ;
	private int discountPer ;
	private double sellingPrice ;
	private String color ;
	private String productType ;
	
	public Product(String productName, double productOrginalPrice, int discountPer, String color, String productType) {
		super();
		this.productName = productName;
		this.productOrginalPrice = productOrginalPrice;
		this.discountPer = discountPer;
		this.color = color;
		this.productType = productType;
		this.sellingPrice = calculateSellingPriceOfProduct();
	}

	public Product() {
		super();
	}
	
	private double calculateSellingPriceOfProduct() {
		double discount = productOrginalPrice * discountPer / 100 ;
		sellingPrice = productOrginalPrice - discount ;
		return sellingPrice ;
	}


	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductOrginalPrice() {
		return productOrginalPrice;
	}

	public void setProductOrginalPrice(double productOrginalPrice) {
		this.productOrginalPrice = productOrginalPrice;
	}

	public int getDiscountPer() {
		return discountPer;
	}

	public void setDiscountPer(int discountPer) {
		this.discountPer = discountPer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productOrginalPrice=" + productOrginalPrice + ", discountPer="
				+ discountPer + ", color=" + color + ", productType=" + productType + "]";
	}

}
