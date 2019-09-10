/**
 * 
 * @author Moheeb
 *
 */
import java.util.Scanner;
public class Sub5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1 intoduce the progrma
		System.out.println("Welcom, this program will let you subtract numberes");
		//2-- ask the user for the inputs
		System.out.println("Enter the numberes than press enter : ");
		//3-- Wait for the user to inputs and than store 
		System.out.println("Enter fist number here: ");
		int num1 = input.nextInt();
		System.out.println("Enter Second number here: ");
		int num2 = input.nextInt();
		System.out.println("Enter third number here: ");
		int num3 = input.nextInt();
		System.out.println("Enter fourth number here: ");
		int num4 = input.nextInt();
		System.out.println("Enter fifth number here: ");
		int num5 = input.nextInt();
		//4 Calculate 
		int result = num1-num2-num3-num4-num5;
		//5 Display result 
		System.out.println("Your result is " + result);
		
	}
}
