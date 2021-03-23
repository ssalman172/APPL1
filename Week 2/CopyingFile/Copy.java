package CopyingFile;

/*
 * Program : Copy.java
 * Fungsi  : Menyalin teks dari sebuah file dan menampilkan nya sebagai output
 * Author  : Salman S.
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {
		boolean success = false;
		
		
		while (!success) { // Perulangan hingga mendapat file yang valid
			try {
				Scanner scan = new Scanner(System.in);
				
				System.out.print("Masukkan nama file : ");
				String namaFile = scan.nextLine();
				FileReader fileInputReader = new FileReader(namaFile);
				BufferedReader fileInputBuffer = new BufferedReader(fileInputReader);
				
				String isiFile = fileInputBuffer.readLine();
				System.out.println("Isi File : \n");
				System.out.println(isiFile);
				
				fileInputReader.close();
				fileInputBuffer.close();
				success = true;
			}
			catch(Exception FileNotFoundException) {
				System.out.println("File Not Found, Try again.\n");
			}
		}
	}
}