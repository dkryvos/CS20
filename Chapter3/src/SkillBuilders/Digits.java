package SkillBuilders;

import java.util.Scanner;

public class Digits {
	
	public static void main(String[] args) {
		//Declaration
		int number, onesPlace, tensPlace;
		
		
		//Create Scanner object 
		Scanner userinput = new Scanner(System.in);
		
		//Get two digit number from the user
		System.out.println("Enter a two digit number: ");
		
		//Store the number from user
		number = userinput.nextInt();
		
		//Calculate ones and tens place values
		onesPlace = number % 10;
		tensPlace = number / 10;
		
		System.out.println("The tens-digit is: " + tensPlace + " and the ones-digit is" + onesPlace);
	}
}
