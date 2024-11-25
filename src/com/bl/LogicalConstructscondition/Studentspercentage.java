package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class Studentspercentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the grade : ");
		int percentage = scan.nextInt();
		
		if(percentage >= 90) {
			System.out.println("Grade A");
		}
		else if(percentage >=80 && percentage <= 89) {
			System.out.println("Grade B");
		}
		else if(percentage >=70 && percentage <= 79) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Geade D");
		}
		scan.close();
	}

}
