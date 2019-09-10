/**
 * 
 * @author Moheeb
 *
 */
import java.util.Scanner;
public class MulTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1 intoduce the progrma
		System.out.println("Welcom, Tis program\ngenrates" 
						+ " produce of two numberes");
		//2-- ask the user for the inputs
		System.out.println("Enter two numberes: ");
		//3-- Wait for the user to iputs and than store 
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		//4 Calculate 
		int result = num1*num2;
		//5 Display result 
		System.out.println("Your result is " + result);
		
	}
}
