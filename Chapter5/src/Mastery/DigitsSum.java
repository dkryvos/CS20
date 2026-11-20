/*
Program: DigitsSum.java          November 20, 2026

Purpose: Create a DigitsSum application that prompts the user for
a non-negative integer and then displays the sum of the digits.

Author: Denys K.
School: CHHS
Course: CSE 2110 Procedural Programming 1
 
*/


package Mastery;

import java.util.Scanner;

public class DigitsSum {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt the user for positive number
		System.out.print("Enter a positive integer: ");
		//Store the number
		int number = input.nextInt();
		
		int sum = 0;
		int digit = 0;
		
		while(number > 0) {
			digit = number % 10; 
			sum += digit;            
			number = number / 10;    
		}
		
		//output the sum
		System.out.print("The sum of the digits is: " + sum);
		
	}
}

/* Screen Dump

Enter a positive integer: 547
The sum of the digits is: 16

 */
