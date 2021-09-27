//Cohort 4: Shriman Selvamani, Edward Lue, Hickson Frimpong, Yash Kolli
//UVAID: SS5QT

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		ArrayList<String> inputList = new ArrayList<String>();
		
		
		Scanner key = new Scanner(System.in);
		System.out.println("How many Strings would you like to enter?");
		int num = key.nextInt();
		key.nextLine();

		
		String str;
		for(int i = 0; i < num; i++) {
			System.out.println("What String would you like to add?");
			str = key.nextLine();
			inputList.add(str);
			
		}
		
		
		System.out.println(inputList);
		System.out.println(removeDups(inputList));
		//comment out above and uncomment below if you want to try the array bonus
		//System.out.println(Arrays.toString(inputList));
		//System.out.println(Arrays.toString(removeDups(inputList)));
		
	}
	
	public static ArrayList<String> removeDups(ArrayList<String> al) {
		// your code goes here!
		ArrayList<String> al2 = new ArrayList<String>(al);

		Collections.sort(al2);
		
		String str = al2.get(1);
		int count = 0;
		
		for(int i = 0; i < al2.size(); i++) {
			if(al2.get(i).equals(str)) {
				count++;
				if(count>0) {
					al2.remove(i);
					count--;
				}
			}
			else {
				str = al2.get(i);
			}
		}
		return al2;
	}
	
}