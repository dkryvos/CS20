package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		//Declaration
		int total = 0;
		
		//Create Scanner object 
		Scanner userinput = new Scanner(System.in);
		
		//Using FOR cycle to repeat user input 5 times
		for (int i=1; i <= 5; i++) {
			 System.out.print("Enter your grade number " + i + ": ");
			 int grade = userinput.nextInt();	
			 total = total + grade;
		}
		
		//calculate the average
		double average = total / 5;
		
		//output
		System.out.println("Your average grade is: " + average);
	}
}
