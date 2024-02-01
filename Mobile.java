package com.product;

public class Mobile extends Product {

	private String ram ;
	private String storage ;
	private String battery ;
	
	public Mobile(String productName, double productOrginalPrice, int discountPer, String color, String productType,
			String ram, String storage, String battery) {
		
		super(productName, productOrginalPrice, discountPer, color, productType);
		
		this.ram = ram;
		this.storage = storage;
		this.battery = battery;
	}

	public void displayMobileInformation() {
		System.out.println("Mobile Name: " + getProductName());
		System.out.println("Mobile Color: " + getColor());
		System.out.println("Mobile RAM: " + getRam() + "GB");
		System.out.println("Mobile Storage: " + getStorage() + "GB");
		System.out.println("Mobile Battery Backup: " + getBattery() + "mAh");
		System.out.println("M.R.P: ₹" + getProductOrginalPrice());
		System.out.println("Discount: -" + getDiscountPer() + "%");
		System.out.println("Selling Price: ₹" + getSellingPrice());
	}
	
	
	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", storage=" + storage + ", battery=" + battery + "]";
	}
	
	
	
}
