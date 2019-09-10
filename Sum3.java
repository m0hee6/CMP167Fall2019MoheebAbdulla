/**
 * 
 * @author Moheeb
 *
 */
import java.util.Scanner;
public class Sum3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1 intoduce the progrma
		System.out.println("Welcom, this program will let you add numberes");
		//2-- ask the user for the inputs
		System.out.println("Enter three numberes: ");
		//3-- Wait for the user to inputs and than store 
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		//4 Calculate 
		int result = num1+num2+num3;
		//5 Display result 
		System.out.println("Your result is " + result);
		
	}
}
