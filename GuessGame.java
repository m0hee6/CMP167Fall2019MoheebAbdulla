
/**
 * 
 * @author moheebabdulla
 *
 */
import java.util.Scanner;
import java.util.Random;

public class GuessGame {
	public static void main(String[] args) 
	
	{
	     Scanner scnr = new Scanner(System.in);
	     Random rand= new Random();
	     
	     //Into the user
	    System.out.println("Welcome to Guessing 3000");  
	    System.out.println("Would You like to play");
	    String answer = scnr.next();
	    
	    while(answer.equalsIgnoreCase("yes")) {
	    System.out.println("Enter a number from 1 to 10");
	    int userNum = scnr.nextInt();
	    int pcNumber = rand.nextInt(10) + 1;
	    if (userNum == pcNumber) {
	    	System.out.println("You Won!!!");
	    		 
	    }else { 
	    	System.out.println("You lost");
	    	System.out.println("The PC chose " + pcNumber);
	    }
	    System.out.println("Would you like to play again");
	    answer = scnr.next();
	  } 
	    System.out.println("Okay, Comeback Soon!!!!!!!!");
	}
}
