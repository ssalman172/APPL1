package ReadWriteFile;

//****************************************************************************  
// Warning.java  
//
//Reads student data from a text file and writes data to another text file.  
// ****************************************************************************  
import java.util.Scanner;  
import java.io.*;  
public class Warning  {  
	// --------------------------------------------------------------------   
	// Reads student data (name, semester hours, quality points) from a   
	// text file, computes the GPA, then writes data to another file   
	// if the student is placed on academic warning.  
	// --------------------------------------------------------------------   
	public static void main (String[] args)  {  
		int creditHrs; // number of semester hours earned   
		double qualityPts; // number of quality points earned   
		double gpa; // grade point (quality point) average 
		String[] line;
		String name, inputName = "D:\\eclipse-workspace\\Week2_APPL1\\src\\ReadWriteFile\\students.dat";  
		String outputName = "D:\\eclipse-workspace\\Week2_APPL1\\src\\ReadWriteFile\\warning.dat"; 
		try  {  
			Scanner scan = new Scanner(new File(inputName)); // Set up scanner to input file  
			PrintWriter outFile = new PrintWriter(outputName); // Set up the output file stream  
			// Print a header to the output file  
			outFile.println ();  
			outFile.println ("Students on Academic Warning");  
			outFile.println ();  
			// Process the input file, one token at a time    
			while (scan.hasNextLine())  {  
				line = scan.nextLine().split(" "); // Menampung data per line dalam array dipisah dengan spasi
				// Get the credit hours and quality points and
				// determine if the student is on warning. If so,				
				// write the student data to the output file.  
				name = line[0];
				// Parsing digunakan agar bentuk string dari file dapat ditampung menjadi tipe data yang dibutuhkan
				creditHrs = Integer.parseInt(line[1]);
				qualityPts = Double.parseDouble(line[2]);
				gpa = qualityPts/creditHrs;
				
				if ((gpa<1.5 && creditHrs<30) || (gpa<1.75 && creditHrs<60) || (gpa<2)) {
					outFile.println(name + " " + creditHrs + " " + gpa);
				}
		}  
			outFile.close(); // Close output file  
			System.out.println("Filter Success, check the output file");
		}  
		catch (FileNotFoundException exception)  {  
			System.out.println ("The file " + inputName + " was not found.");   
		}  
		catch (NumberFormatException e)  {  
			System.out.println ("Format error in input file: " + e);   
		}  
	}  
} 
