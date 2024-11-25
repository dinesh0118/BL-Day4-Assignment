package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class LargetNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		System.out.println("Enter the third number : ");
		int num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("The heighest number is "+num1);
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println("The heighest number is "+num2);
		}
		else if(num3 >= num1 && num3 >= num2) {
			System.out.println("The heighest number is "+num3);
		}
		scan.close();
	}

}
