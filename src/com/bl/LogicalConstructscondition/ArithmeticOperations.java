package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		System.out.println("Enter the operator to perform task : ");
		char c = scan.next().charAt(0);
		
		switch(c) {
		case '+' :
			System.out.println(num1 + num2);
			break;
		case '-' :
			System.out.println(num1 - num2);
			break;
		case '*' :
			System.out.println(num1 * num2);
			break;
		case '/' :
			if(num2 != 0) {
				System.out.println(num1 / num2);
			}
			else {
				System.out.println("Second number should not be zero.");
			}
			break;	
		}
		scan.close();
	}

}
