/*
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md
*/


import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
* Lab Activity 11 - Sets
* Practice writing methods that involve Sets and Maps
* Using specific implementation classes: HashSet and TreeMap
* Don't forget to comment the code that you write. Also, test your code in the main method
*/
public class LabActivity11 {

    /**
    * This method (names) takes in two sets: one of names already on cards
    * and the other containing the top 100 names. The method returns
    * a set of names for the new cards needed (in topNames but not in cards) 
    */
    public static HashSet<String> names(HashSet<String> cards, HashSet<String> topNames){
		// TODO: Write the body of this method! 
    	for(String name : topNames) {
    		cards.add(name);
    	}
    	return cards;
    }
    
    /**
    * This method (reverseBook) takes a TreeMap representation of a phonebook
    * (Key=Name, a String, and Value=Number, an Integer).
    * The method returns the reverse phonebook (that is, you know the number
    * and you're looking for the name)
    */  
    public static TreeMap<Integer, String> reverseBook(TreeMap<String, Integer> phoneBook){
		// TODO: Write the body of this method!
    	TreeMap<Integer, String> reverse = new TreeMap<Integer, String>();
    	for(String s : phoneBook.keySet()) {
    		reverse.put(phoneBook.get(s), s);
    	}
    	return reverse;
    }
    
    
    public static void main(String[] args) {
        HashSet<String> cards = new HashSet<String>() ;
		HashSet<String> topNames = new HashSet<String>();
		cards.add("Bob");
		cards.add("Billy");
		topNames.add("Bob");
		topNames.add("Harry");
		System.out.println("First set: " + cards);
		System.out.println("Second set: " + topNames);
		System.out.println("Combined: " + names(cards,topNames));
		
		TreeMap<String, Integer> phonebook = new TreeMap<String,Integer>();
		phonebook.put("bob",1223);
		phonebook.put("sally",1225);
		System.out.println("Phonebook: "+ phonebook);
		System.out.println("Reversed Phonebook:" + reverseBook(phonebook));
    
    }

}