package Mastery;

import java.util.Scanner;

public class timeConversion {
	public static void main(String[] args) {
		//Declaration
		int totalminutes, hours, minutes;
		
		
		//Create Scanner object 
		Scanner userinput = new Scanner(System.in);
		
		//Get total minutes number from the user
		System.out.print("Enter the time in minutes: ");
		
		//Store the number from user
		totalminutes = userinput.nextInt();
		
		//calculate the hours and minutes 
		hours = totalminutes / 60;
		minutes = totalminutes % 60;

		//output
		System.out.println("The time is: " + hours+":"+minutes);
	}
}