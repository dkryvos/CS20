package SkillBuilders;

import java.util.Scanner;

public class RandomNum {
	public static void main(String[] args) {
		//Declare min and max variables
		int min, max;
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for min number
		System.out.println("Enter a minimum number: ");
		
		//Store the min number
		min = input.nextInt();
		
		//Prompt the user for max number
		System.out.println("Enter a maximum number: ");
		
		//Store the max number
		max = input.nextInt();
		
		//Generate the random numbers
		System.out.println("Random number: "+(int)((max-min + 1)*Math.random()+min));

	}
}
