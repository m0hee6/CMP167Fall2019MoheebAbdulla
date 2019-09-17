/**
 * 
 * @author Moheeb
 * 
 */


import java.io.StringWriter;
import java.io.PrintWriter;

public class unite3practicept3 {
	public static void main(String[] args) {
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.print("Moe Abdulla");
		String name = sw.toString();
		
		System.out.println(name);
		
	}
}
