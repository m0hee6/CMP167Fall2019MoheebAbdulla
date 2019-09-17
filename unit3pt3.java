/**
 * 
 * @author Moheeb
 * 
 */
package week3;

import java.io.StringWriter;
import java.io.PrintWriter;

public class unit3pt3 {
	public static void main(String[] args) {
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.print("Ana Katherina");
		String name = sw.toString();
		
		System.out.println(name);
		
	}
}
