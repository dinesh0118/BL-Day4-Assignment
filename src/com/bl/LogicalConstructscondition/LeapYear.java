package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		String input = scan.nextLine();
		boolean isLeapYear = false;
		
		if(input.matches("\\d+")) {
			int year = Integer.parseInt(input);
			
			if(year >= 1582) {
				if((year % 4 ==0 && year %100 != 0)|| year %400 ==0 ) {
					isLeapYear = true;
				}
			}else {
				System.out.println("year must be >= 1582");
			}
		}else {
			System.out.println("Invalid input! Please enter a valid numeric year.");
		}
		 System.out.println("Is Leap Year: " + isLeapYear);
		 scan.close();
	}

}
