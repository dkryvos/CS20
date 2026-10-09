/*
Program: QuadraticEquation.java          October 9, 2026

Purpose: Create a QuadraticEquation application that gives the solution to
any quadratic equation. The application should prompt the user for values for a, b, and c (ax2 + bx + c = 0)
and then display the roots, if any. The quadratic equation takes the form: (-b +-√b²-4ac) / (2a)


Author: Denys K.
School: CHHS
Course: CSE 2140 2nd Language Programming
 
*/


package Mastery;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		//declaration
		double a, b, c;
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt the user for A value
		System.out.print("Enter value for a: ");
		//Store the A value
		a = input.nextDouble();
		
		//Prompt the user for B value
		System.out.print("Enter value for b: ");
		//Store the B value
		b = input.nextDouble();
		
		//Prompt the user for C value
		System.out.print("Enter value for c: ");
		//Store the C value
		c = input.nextDouble();
		
		//solve the roots using the (-b +-√b²-4ac) / (2a) form
		double root1 = (-b + Math.sqrt(b*b - 4 * a * c)) / (2*a);
		double root2 = (-b - Math.sqrt(b*b - 4 * a * c)) / (2*a);
		
		//output the root
		System.out.print("The roots are " + root1 + " and " + root2);
		
	}
}

/* Screen Dump

Enter value for a: 2
Enter value for b: 4
Enter value for c: -30
The roots are 3.0 and -5.0
 
 */
