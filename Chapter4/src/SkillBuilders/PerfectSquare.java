package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		int sqr, num;
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		if (num < 0) {
            System.out.println(num + " is not a perfect square.");
        } else {
            sqr = (int) Math.sqrt(num);
            
            if (sqr * sqr == num) {
                System.out.println(num + " is a perfect square.");
            } else {
                System.out.println(num + " is not a perfect square");
            }
        }
	}
}
