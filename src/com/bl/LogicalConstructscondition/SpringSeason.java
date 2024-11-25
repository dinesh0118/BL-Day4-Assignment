package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month : ");
		int month  = scan.nextInt();
		System.out.println("Enter the day : ");
		int day = scan.nextInt();
		boolean result = false;
		
		if(month <1 || month >12 || day <1 || day >30) {
			System.out.println("Input is not valid. Month should be 1-12 and day should be 1-30.");
		}
		else {
			if((month == 2 && day >= 12) || (month == 3) || (month == 4 && day <=11)) {
				result = true;
			}
			System.out.println(result);
			scan.close();
		}
	}

}
