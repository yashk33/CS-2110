/* Shriman Selvamani, Hickson Frimpong, Edward Lue, Yash Kolli
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInData {
	
	public static double readData(String fileName) {
		File file = new File(fileName);
		Scanner scan;
		double sum = 0;
		try {
			scan = new Scanner(file);
			int numOfValues = Integer.parseInt(scan.nextLine()); // Read in Val for # values
			for(int i = 0; i < numOfValues; i++) { // for-loop to get that many values
				sum += scan.nextDouble(); // add the values together (doubles)
			}
			scan.close();
			return sum; // return the sum of all the values in the file 
		}
		catch(FileNotFoundException e){//add catch statements here
			System.out.println("File could not be found.");
			return sum;
		}
		
		catch(NumberFormatException e) {
			System.out.println("Numbers in file are not formated correctly.");
			return sum;
		}
		
		catch(InputMismatchException e) {
			System.out.println("File doesn't contain only integers");
			return sum;
		}
		
		catch(RuntimeException e) {
			System.out.println("An error occured.");
			return sum;
		} 
		
		catch(Exception e) {
			System.out.println("An error occured.");
			return sum;
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(readData("src/Test3.txt"));
		System.out.println(readData("src/Test2.txt"));
		System.out.println(readData("src/Text4.txt")); // notice spelling of the file name! 
		System.out.println(readData("src/Test4.txt"));
	}

}