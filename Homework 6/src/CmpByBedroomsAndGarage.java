import java.util.Comparator;

public class CmpByBedroomsAndGarage implements Comparator<Willow> {
	public CmpByBedroomsAndGarage() { //empty constructor

	}

	@Override
	public int compare(Willow p1, Willow p2) {
		if (p2.getBedrooms() - p1.getBedrooms() != 0) {//checks if bedroom # is not the same
			return p2.getBedrooms()-p1.getBedrooms();
		} 
		else if (p1.getGarage() != p2.getGarage()) {
			if (p1.getGarage())
				return -1;//sorts for having a garage first
			else
				return 1;//otherwise not
		} else
			return 0;
	}

}
