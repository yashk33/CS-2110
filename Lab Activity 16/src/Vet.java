import java.util.ArrayList;
import java.util.List;



/**
 * 
 * @author CS 2110 Faculty
 * Vet class, where all domesticated animals must visit
 *
 */

/*
 * Cohort Group 4: Shriman S, Edward L, Hickson F, Yash K
 *  10/10/2020 4:30PM
*/ 

public class Vet {

	// TODO The following method is incomplete; you need to fix it to:
	// a) take an animal argument and b) have the animal make its noise
	public static void giveShot(Animal a) {
		// do horrible things to the animal
		String ret = a.getClass() +" "+ a.name + " after the shot cried " + a.makeNoise();
		System.out.println(ret.substring(5));
	}
	
	public static void main(String[] args) {
		Animal a = new Dog("Jack");
		Animal c = new Cat("Garfield");
		Animal m = new Animal("Marlow");
		giveShot(a);
		giveShot(c);
		giveShot(m);		
		
		// TODO Complete the rest of the code to print the following output:
		// > Dog Jack after the shot cried Woof!
		// > Cat Garfield after the shot cried Miaw!
		// > Animal Marlow after the shot cried ...

	}

}