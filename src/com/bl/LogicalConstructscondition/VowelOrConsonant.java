package com.bl.LogicalConstructscondition;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character to check the Vowel or Consonent : ");
		
		char c = scan.next().charAt(0);
		
		switch(c) {
		case 'a','A' :
			System.out.println("Vowel");
			break;
		case 'e','E' :
			System.out.println("Vowels");
			break;
		case 'i','I' :
			System.out.println("Vowels");
			break;
		case 'o','O' :
				System.out.println("Vowels");
		case 'u','U' :
			System.out.println("Vowels");
			break;	
		}
		scan.close();

	}

}
