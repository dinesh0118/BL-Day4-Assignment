package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class SeasonCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int season = scan.nextInt();
		
		switch (season) {
		case 12,1,2 :
			System.out.println("Winter");
			break;
		case 3,4,5 :
			System.out.println("Spring");
			break;
		case 6,7,8 :
			System.out.println("Summar");
			break;
		case 9,10,11 :
			System.out.println("Fal");
			break;	
		}
		scan.close();
	}

}
