/**
 * 
 * @author Moheeb
 * 
 */
package week3;

import java.util.Scanner;

public class unit3pt2 {
	public static void main(String[] args) {
		
		String myWorld = "Sara 45 Cruz";
		Scanner in = new Scanner(myWorld);
		
		String name = in.next();
		int age = in.nextInt();
		
		System.out.printf("%s is %d years old", name, age);
		
	}

}
