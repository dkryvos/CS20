package SkillBuilders;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		//Declaration
		int length;
		int width;
		
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
		System.out.print("The width is: " + width);

	}

}