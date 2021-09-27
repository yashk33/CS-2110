

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;

public class HW6Tests {

	@Test
	public void testConstructor1() {
		Willow w1 = new Willow("Test1",0, false, 0.0,0.0);
		w1.setBedrooms(1);
		w1.setDistToCenter(5.0);
		w1.setGarage(true);
		w1.setNeighborhood("Test");
		w1.setPrice(10.0);
	}
	
	@Test
	public void testConstructor2() {
		Willow w2 = new Willow("Test2", 5, true, 5.8, 2.4);
	}
	
	@Test
	public void testCompareTo() {
		Willow w = new Willow("runk", 3, true,2.1,4.1);
		Willow x = new Willow("newcomb", 2, true, 1.2, 3.1);
		assertTrue(w.compareTo(x) > 0);
		
	}
	
	@Test
	public void testCompareTo2() {
		Willow w1 = new Willow("Test1",0, false, 0.0,0.0);
		Willow w2 = new Willow("Test1",0, false, 0.0,0.0);
		assertTrue(w2.compareTo(w1)==0);
	}
	
	@Test
	public void sortByNeighborhoodAndPrice1​() { //Test 1 for sorting by Neighborhood and Price
		Willow w1 = new Willow("A",1, false, 1.0,1.0);
		Willow w2 = new Willow("C",2, true, 2.0,2.0);
		Willow w3 = new Willow("B",3, false, 3.0,3.0);
		ArrayList<Willow> willow1 = new ArrayList<Willow>();
		willow1.add(w1);
		willow1.add(w2);
		willow1.add(w3);
		ArrayList<Willow> willow2 = new ArrayList<Willow>();
		willow2.add(w1);
		willow2.add(w3);
		willow2.add(w2);
		Willow.sortByNeighborhoodAndPrice​(willow1);
		assertEquals(willow1, willow2);		
	}
	
	@Test
	public void sortByNeighborhoodAndPrice2() { //Test 2 for sorting by Neighborhood and Price
		Willow w = new Willow("runk", 3, true,2.1,4.1);
		Willow x = new Willow("newcomb", 2, true, 1.2, 3.1);
		Willow y = new Willow("ohill", 1, false, 3.1, 2.1);
		ArrayList<Willow> z = new ArrayList<Willow>();
		z.add(w);
		z.add(x);
		z.add(y);
		ArrayList<Willow> a = new ArrayList<Willow>();
		a.add(x);
		a.add(y);
		a.add(w);
		Willow.sortByNeighborhoodAndPrice​(z);
		assertEquals(a, z);
		
	}
	
	@Test
	public void sortByNeighborhoodAndPrice3() { //Test 2 for sorting by Neighborhood and Price
		Willow w = new Willow("runk", 3, true,2.1,4.1);
		Willow x = new Willow("runk", 2, true, 1.2, 3.1);
		Willow y = new Willow("runk", 1, false, 3.1, 2.1);
		ArrayList<Willow> z = new ArrayList<Willow>();
		z.add(w);
		z.add(x);
		z.add(y);
		ArrayList<Willow> a = new ArrayList<Willow>();
		a.add(w);
		a.add(x);
		a.add(y);
		Willow.sortByNeighborhoodAndPrice​(z);
		assertEquals(a, z);
		
	}
	@Test
	public void sortByBedroomsandGarage1() { //Test 1 for sorting by bedroom and garage
		Willow w1 = new Willow("A",1, false, 1.0,1.0);
		Willow w2 = new Willow("C",2, true, 2.0,2.0);
		Willow w3 = new Willow("B",3, false, 3.0,3.0);
		ArrayList<Willow> willow1 = new ArrayList<Willow>();
		willow1.add(w1);
		willow1.add(w2);
		willow1.add(w3);
		ArrayList<Willow> willow2 = new ArrayList<Willow>();
		willow2.add(w3);
		willow2.add(w2);
		willow2.add(w1);
		Willow.sortByBedroomsAndGarage​(willow1);
		assertEquals(willow1, willow2);		
	}
	
	@Test
	public void sortByBedroomsandGarage2() { //Test 2 for sorting by bedroom and garage
		Willow w1 = new Willow("A",1, true, 1.0,1.0);
		Willow w2 = new Willow("C",3, true, 2.0,2.0);
		Willow w3 = new Willow("B",3, false, 3.0,3.0);
		ArrayList<Willow> willow1 = new ArrayList<Willow>();
		willow1.add(w1);
		willow1.add(w2);
		willow1.add(w3);
		ArrayList<Willow> willow2 = new ArrayList<Willow>();
		willow2.add(w2);
		willow2.add(w3);
		willow2.add(w1);
		Willow.sortByBedroomsAndGarage​(willow1);
		assertEquals(willow1, willow2);		
	}
	
	@Test
	public void sortByBedroomsandGarage3() { //Test 2 for sorting by bedroom and garage
		Willow w1 = new Willow("A",3, true, 1.0,1.0);
		Willow w2 = new Willow("C",3, true, 2.0,2.0);
		Willow w3 = new Willow("B",3, true, 3.0,3.0);
		ArrayList<Willow> willow1 = new ArrayList<Willow>();
		willow1.add(w1);
		willow1.add(w2);
		willow1.add(w3);
		ArrayList<Willow> willow2 = new ArrayList<Willow>();
		willow2.add(w1);
		willow2.add(w2);
		willow2.add(w3);
		Willow.sortByBedroomsAndGarage​(willow1);
		assertEquals(willow1, willow2);		
	}
	
}
