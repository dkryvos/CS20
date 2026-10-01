package Mastery;

import java.util.Scanner;

public class ThreeDigit {
	
	public static void main(String[] args) {
		//Declaration
		int number, hundredsPlace, tensPlace, onesPlace;
		
		
		//Create Scanner object 
		Scanner userinput = new Scanner(System.in);
		
		//Get three digit number from the user
		System.out.println("Enter a three digit number: ");
		
		//Store the number from user
		number = userinput.nextInt();
		
		//Calculate ones, tens and hundreds place values
		hundredsPlace = number / 100;
		tensPlace = number / 10 % 10;
		onesPlace = number % 10;
		
		//output
		System.out.println("The hundreds place digit is: " + hundredsPlace);
		System.out.println("The tens place digit is: " + tensPlace);
		System.out.println("The ones place digit is " + onesPlace);
	}
}
