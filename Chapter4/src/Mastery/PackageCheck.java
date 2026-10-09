/*
Program: PackageCheck.java          October 9, 2026

Purpose: A delivery service does not accept packages heavier than 27 kilograms or larger than 0.1 cubic meters
(100,000 cubic centimeters). Create a PackageCheck application that prompts the user for the weight of
a package and its dimensions (length, width, and height), and then displays an appropriate message
if the package does not meet the requirements. Messages should include:


Author: Denys K.
School: CHHS
Course: CSE 2140 2nd Language Programming
 
*/

package Mastery;

import java.util.Scanner;

public class PackageCheck {
	public static void main(String[] args) {
		double kg, length, width, height;
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt the user for kg value
		System.out.print("Enter package weight in kilograms: ");
		//Store the kg value
		kg = input.nextDouble();
		
		//Prompt the user for length value
		System.out.print("Enter package length in centimeters: ");		
		//Store the length value
		length = input.nextDouble();
		
		//Prompt the user for width value
		System.out.print("Enter package width in centimeters: ");		
		//Store the width value
		width = input.nextDouble();
		
		//Prompt the user for height value
		System.out.print("Enter package height in centimeters: ");		
		//Store the height value
		height = input.nextDouble();
		
		double volume = length * width * height;
		
		if (kg > 27 && volume > 100000) System.out.print("Too heavy and too large.");
		else if (kg > 27) System.out.print("Too heavy.");	
		else if (volume > 100000) System.out.print("Too large.");
		else System.out.print("Your package is accepted.");	
	}
}


/*  Screen Dump

Enter package weight in kilograms: 28
Enter package length in centimeters: 55
Enter package width in centimeters: 38
Enter package height in centimeters: 65
Too heavy and too large.

*/
