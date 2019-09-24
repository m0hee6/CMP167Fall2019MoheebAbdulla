package w4p2;

import java.util.Scanner;

public class SuperMarket {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer;
		double budget; 
		
		System.out.println("Welcome To moe super Market");
		System.out.println("Woul;d you like to see the iventory");
		
		answer = in.next();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.printf("1.%s 2.%s 3.%s",  "Pringles", "pizza", "chicken");
			
			System.out.println("Would like to buy something? 1 2 3 0");
			int choice= in.nextInt();
			switch(choice) {
			case 1:
			System.out.println("You selcted Pringles");
			System.out.println("That is $4.99");
				break;
			case 2:
				System.out.println("You selcted pizza");
				System.out.println("That is $3.75");
				break;
			case 3:
				System.out.println("You selcted chicken");
				System.out.println("That is $14.99");
			}
		}
		else
		
		{
			System.out.println("Okay, Goodbye");
		}
		}
	}

