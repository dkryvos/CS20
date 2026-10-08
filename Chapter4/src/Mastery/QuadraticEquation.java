package Mastery;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		double a, b, c;
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt the user for A value
		System.out.print("Enter value for a: ");
		//Store the A value
		a = input.nextDouble();
		
		//Prompt the user for B value
		System.out.print("Enter value for b: ");
		//Store the A value
		b = input.nextDouble();
		
		//Prompt the user for C value
		System.out.print("Enter value for c: ");
		//Store the A value
		c = input.nextDouble();
		
		double root1 = (-b + Math.sqrt(b*b - 4 * a * c)) / (2*a);
		double root2 = (-b - Math.sqrt(b*b - 4 * a * c)) / (2*a);
		
		System.out.print("The roots are " + root1 + " and " + root2);
		
	}
}
