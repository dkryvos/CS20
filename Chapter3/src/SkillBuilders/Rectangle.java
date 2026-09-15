package SkillBuilders;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		//Declaration
		int length;
		int width;
		int area;
		int perimeter;
		
		//Create Scanner object 
		Scanner userinput = new Scanner(System.in);
		
		//Get user width from the keyboard
		System.out.print("Enter width: ");
		width = userinput.nextInt();
		

		//Get user length from the keyboard
		System.out.print("Enter length: ");
		length = userinput.nextInt();
		
		
		//Display the length and width
		System.out.println("The length is: " + length);
		System.out.println("The width is: " + width);

		//Create the formula for the area
		area = width * length;
		
		//display the area
		System.out.println("The area is: " + area);
		
		perimeter = (2 * length + 2 * width);
		
		System.out.print("The perimeter is: " + perimeter);

		

		
	}

}