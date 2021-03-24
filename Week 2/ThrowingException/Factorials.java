package ThrowingException;

//****************************************************************  
// Factorials.java  
//
//Reads integers from the user and prints the factorial of each.  
//  
//****************************************************************  
import java.util.Scanner;  
public class Factorials  {  
	public static void main(String[] args) throws IllegalArgumentException  {
		try {
			String keepGoing = "y";
			while (keepGoing.equals("y") || keepGoing.equals("Y"))  {  
				Scanner scan = new Scanner(System.in);  
				System.out.print("Enter an integer: ");  
				int val = scan.nextInt();  
				// throw new digunakan agar dapat menentukan penanganan error sejenis dengan kasus berbeda.
				if (val<0) {
					throw new IllegalArgumentException ("Can't calculate negative numbers");
				}
				else if (val>16) {
					throw new IllegalArgumentException ("The number is too high");
				}
				else {
					System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));  
				}
				System.out.print("Another factorial? (y/n) ");  
				keepGoing = scan.next();  
			}
		}
		catch(Exception IllegalArgumentException) {
			System.out.println(IllegalArgumentException.toString());   // Akan menampilkan pesan sesuai dengan error yang dihadapi
		}
	}   
}