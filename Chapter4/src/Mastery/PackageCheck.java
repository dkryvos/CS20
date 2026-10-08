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
