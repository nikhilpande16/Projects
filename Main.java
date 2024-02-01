package com.main;

import com.makeproduct.MakeProduct;
import com.product.Mobile;

public class Main {

	public static void main(String[] args) {
		
		Mobile m1 = MakeProduct.createFirstProduct();
		m1.displayMobileInformation();
		
		System.out.println("_________________________________________________________");
		
		Mobile m2 = MakeProduct.createSecondProduct();
		m2.displayMobileInformation();
		
		System.out.println("_________________________________________________________");
		
		Mobile m3 = MakeProduct.createThirdProduct();
		m3.displayMobileInformation();
	}

}
