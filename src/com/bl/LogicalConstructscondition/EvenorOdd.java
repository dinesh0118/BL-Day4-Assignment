package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check whether the given number is even or odd ?");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		scan.close();
	}

}
