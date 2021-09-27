import java.util.Comparator;

public class CmpByNeighborhoodAndPrice implements Comparator<Willow> {
	public CmpByNeighborhoodAndPrice() { //empty constructor

	}

	@Override
	public int compare(Willow p1, Willow p2) {
		if (p1.getNeighborhood().compareTo(p2.getNeighborhood()) != 0) {//checks if the neighborhood is first
			return p1.getNeighborhood().compareTo(p2.getNeighborhood());//otherwise put them after
		} else if (p1.getPrice() - p2.getPrice() != 0) {//checks if prices are not the same
			if(p2.getPrice()-p1.getPrice()>0){ //sort the higher price first
				return 1;
			}
			else
				return -1;
		} else {
			return 0;
		}
	}
}