import java.util.Scanner;

/**
 * 
 * @author Moheeb
 *
 */
public class Unit4 {
	public static void main(String[] args) {
		int age;
		String name;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, this program will let you know if you can or can't drink ALCOHOL");
		System.out.print("Enter Your Name: ");
		name = in.next();
		System.out.printf("Okay %s, Enter your age : ", name);
		age = in.nextInt();
		
		if(age >= 21) {
			System.out.println("Awsome, you can drink alcohol!!");
		}else {
			System.out.println("Sorry you cant drink alcohol");
		}
	}
}
