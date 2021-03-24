package PlacingExceptionHandlers;

//****************************************************************  
// ParseInts.java  
//
//Reads a line of text and prints the integers in the line.  
//  
//****************************************************************  
import java.util.Scanner;  
public class ParseInts  {  
	public static void main(String[] args)  {  
		// Variabel sum dipindahkan ke luar looping agar data perhitungan tepat
		int sum = 0;
		Scanner scan = new Scanner(System.in);  
		String line;  
		System.out.println("Enter a line of text");  
		Scanner scanLine = new Scanner(scan.nextLine());  
		while (scanLine.hasNext()) {
			try {
				int val;  
				val = Integer.parseInt(scanLine.next());  
				sum += val;
			}		
			catch (Exception NumberFormatException) {
				
			}
		}
		System.out.println("The sum of the integers on this line is " + sum);   
	}  
} 