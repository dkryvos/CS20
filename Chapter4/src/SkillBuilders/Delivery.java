package SkillBuilders;

import java.util.Scanner;

public class Delivery {
	public static void main(String[] args) {
		double kg, length, width, height;
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
				
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
		
		if (length > 10 || width > 10 || height > 10) System.out.print("Reject.");
		else if (length <= 10 && width <= 10 && height <= 10) System.out.print("Accept.");	
	}

}

/* Screen dump

Enter package length in centimeters: 5
Enter package width in centimeters: 9
Enter package height in centimeters: 10
Accept.

*/