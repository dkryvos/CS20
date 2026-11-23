/*
Program: DigitsSum.java          November 20, 2026

Purpose: Create a GroupAssignment application that prompts the user for his or her name and then displays a
group assignment. The group assignment depends on the first letter of the student’s last name.
Last names beginning with A through I are assigned to Group 1, J through S are assigned to
Group 2, T through Z are assigned to Group 3.


Author: Denys K.
School: CHHS
Course: CSE 2110 Procedural Programming 1
 
*/


package Mastery;

import java.util.Scanner;

public class GroupAssignment {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt the user for their first name
		System.out.print("Enter your first name: ");
		
		//Store the first name
		String fname = input.next();
		
		//Prompt the user for their last name
		System.out.print("Enter your last name: ");
		
		//Store the last name
		String lname = input.next();
		
        char firstLetter = lname.toUpperCase().charAt(0);
        
        int group;

        // Assign group based on first letter
        if (firstLetter >= 'A' && firstLetter <= 'I') {
            group = 1;
        } else if (firstLetter >= 'J' && firstLetter <= 'S') {
            group = 2;
        } else {	
            group = 3;
        }
		
		//output the 
		System.out.print(fname + " " + lname +" is assigned to Group "+group);
	}
}

/* Screen Dump




 */
