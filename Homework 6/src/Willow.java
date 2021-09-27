import java.util.ArrayList;
import java.util.Collections;

public class Willow implements Comparable<Willow> {

	//instance variables
	private String neighborhood;
	private int bedrooms;
	private boolean garage;
	private double distToCenter;
	private double price;

	public Willow(String n, int nb, boolean g, double dtc, double p) { //constructor
		neighborhood = n;
		bedrooms = nb;
		garage = g;
		distToCenter = dtc;
		price = p;
	}

	public String getNeighborhood() { //gets neighborhood
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) { //sets neighborhood
		this.neighborhood = neighborhood;
	}

	public int getBedrooms() { //gets bedrooms
		return bedrooms;
	}

	public void setBedrooms(int numBedrooms) { //sets bedrooms
		this.bedrooms = numBedrooms;
	}

	public boolean getGarage() { //gets garage
		return garage;
	}

	public void setGarage(boolean garage) { //sets garage
		this.garage = garage;
	}

	public double getDistToCenter() { //gets distance to center
		return distToCenter;
	}

	public void setDistToCenter(double distToCenter) { //sets distance to center 
		this.distToCenter = distToCenter;
	}

	public double getPrice() { //gets price
		return price;
	}

	public void setPrice(double price) { //sets price
		this.price = price;
	}

	public String toString() { //return string version of Willow
		return "[" + this.neighborhood + "|" + this.bedrooms + "|" + this.garage + "|" + this.distToCenter + "|" + this.price + "]";
		//return "[Neighborhood: " + this.neighborhood + " Bedrooms: " + this.bedrooms + " Garage: " + this.garage;
	}

	@Override
	public int compareTo(Willow other) { //compares two Willows
		if(this.price-other.getPrice()!=0) {
			if(this.price-other.getPrice()>0) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else if(this.distToCenter - other.getDistToCenter() != 0) {
			if(this.distToCenter - other.getDistToCenter()>0)
				return 1;
			else
				return -1;
		}
		else return 0;
	}

	public static void sortByBedroomsAndGarage​(ArrayList<Willow> pList) { //sorts Willow List by Bedrooms then Garages
		Collections.sort(pList, new CmpByBedroomsAndGarage());
	}

	public static void sortByNaturalOrdering​(ArrayList<Willow> pList) { //sorts Willow List by Default
		Collections.sort(pList);
	}
	
	public static void sortByNeighborhoodAndPrice​(ArrayList<Willow> pList) { //sorts Willow List by Neighborhood then Price
		Collections.sort(pList, new CmpByNeighborhoodAndPrice());
	}
//	public static void main(String[] args) {
//		Willow w1 = new Willow("A",1, true, 1.0,1.0);
//		Willow w2 = new Willow("C",3, true, 2.0,2.0);
//		Willow w3 = new Willow("B",3, false, 3.0,3.0);
//		ArrayList<Willow> willow1 = new ArrayList<Willow>();
//		willow1.add(w1);
//		willow1.add(w2);
//		willow1.add(w3);
//		ArrayList<Willow> willow2 = new ArrayList<Willow>();
//		willow2.add(w2);
//		willow2.add(w3);
//		willow2.add(w1);
//		Willow.sortByBedroomsAndGarage​(willow1);
//		System.out.println(willow1);
//		System.out.println(willow2);
//	}
}
