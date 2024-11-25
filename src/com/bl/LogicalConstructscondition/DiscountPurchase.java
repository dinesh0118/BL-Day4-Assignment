package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class DiscountPurchase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int amount = scan.nextInt();
		
		int discount = (amount >= 500) ? 500*20/100 : 500*10/100;
		System.out.println("Discount : "+discount);
		scan.close();
	}

}
