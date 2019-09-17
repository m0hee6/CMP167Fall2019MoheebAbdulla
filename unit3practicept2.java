/**
 * 
 * @author Moheeb
 * 
 */


import java.util.Scanner;

public class unit3practicept2 {
	public static void main(String[] args) {
		String info = "Moheeb 18 Abdulla";
		Scanner in = new Scanner(info);
		String name = in.next();
		int age = in.nextInt();
		
		System.out.printf("%s is %d years old. ", name, age);
		
	}

}
