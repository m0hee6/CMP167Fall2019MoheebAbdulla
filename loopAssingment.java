import java.util.Scanner;
public class loopAssingment {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number here: ");
		 int n = input.nextInt();
		 int i = 1;
		 
		 for (i = 1; i < n+1; i++)
		 {
			 System.out.println(i);
			 
		 }
		 System.out.println("");
		 System.out.println("The squares are: ");
		 for (i = 1; i < n+1; i++)
		 {
			 System.out.println(i*i);
			 
		 }
		 System.out.println("");
		 System.out.println("Enter two Numberes: ");
		 int num1 = input.nextInt();
		 int num2 = input.nextInt();
		 
		 System.out.println("");
		 System.out.println("The sum of the two numbres are: " );
		 System.out.println(num1 + num2);
		 
		 System.out.println("");
		 System.out.println("The Sum of all the Numberes are: ");
		 
		 for (i = 1; i < n+1; i++)
		 {
			 System.out.println(i+i);
			 
		 }
	}

}
