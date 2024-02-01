package com.makeproduct;

import com.product.Mobile;

public class MakeProduct {

	public static Mobile createFirstProduct() {
		Mobile redmi = new Mobile("Redmi 11", 15999 , 13, "Black", "mobile", "4", "64", "5000");
		return redmi ;
	}
	
	public static Mobile createSecondProduct() {
		Mobile samsung  = new Mobile("Samsung Galaxy", 11999 , 38, "Green", "mobile", "4", "64", "5000");
		return samsung ;
	}
	
	public static Mobile createFourthProduct() {
		Mobile samsung  = new Mobile("Samsung Galaxy", 12999 , 38, "Green", "mobile", "4", "64", "5000");
		return samsung ;
	}
	
	public static Mobile createThirdProduct() {
		Mobile oneplus  = new Mobile("OnePlus", 22558 , 11, "blue", "mobile", "8", "128", "5000");
		return oneplus ;
	}
	
}
