import java.util.ArrayList;
/*
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md
*/

//	Meme
//	-----------------------
//	+creator: User
//	+backgroundimage: BackgroundImage
//	+ratings: ArrayList<Rating>
//	+caption: String
//	+shared: boolean
//	----------------------
//  -getUser(): return 
//  -setUser(User creator): return 
//  -getBackgroundImage():
//  -setBackgroundImage():
//  -getRatings():
//  -setRatings():
//  -getCaption():
//  -setCaption():
//  -getShared():
//  -setShared():
//	-toString(): return 
//	-equals(): return 

public class Meme {

	private User creator;
	private BackgroundImage backgroundImage;
	private ArrayList<Rating> rating;
	private String caption;
	private boolean shared;
	
	
	public Meme() {
		this.shared = false;
		this.caption = "";
	}
	public User getCreator() {
		return creator;
	}
	
	public void setCreator(User creator) {
		this.creator = creator;
	}

	public BackgroundImage getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(BackgroundImage backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public ArrayList<Rating> getRatings() {
		return rating;
	}

	public void setRatings(ArrayList<Rating> rating) {
		this.rating = rating;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public boolean getShared() {
		return shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
	}

	//Prints the fields of the object in sentence form
	@Override
	public String toString() {
		/*
		 * return "Meme [Creator = " + creator + ", Background Image = " +
		 * backgroundimage + ", Rating = " + rating + ", Caption = " + caption +
		 * ", Shared = " + shared + "]";
		 */
		
		return "";
	}
	
	//Checks if the other object is a Meme and has the same matching fields
	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false; Meme other = (Meme) obj; if (backgroundimage
		 * == null) { if (other.backgroundimage != null) return false; } else if
		 * (!backgroundimage.equals(other.backgroundimage)) return false; if (caption ==
		 * null) { if (other.caption != null) return false; } else if
		 * (!caption.equals(other.caption)) return false; if (creator == null) { if
		 * (other.creator != null) return false; } else if
		 * (!creator.equals(other.creator)) return false; if (rating == null) { if
		 * (other.rating != null) return false; } else if (!rating.equals(other.rating))
		 * return false; if (shared != other.shared) return false;
		 */
		return true;
	}	
	
}
