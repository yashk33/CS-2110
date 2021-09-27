/*
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md
*/

/*

User
-----------------------------
- userName : String
- memesCreated : ArrayList<Meme>
- memesViewed : ArrayList<Meme>
------------------------------
+ User()
+ getUserName() : String
+ setUserName(userName : String)
+ getMemesCreated() : ArrayList<Meme>
+ equals(obj : Object) : boolean
+ toString : String
+ setMemesCreated(memesCreated : ArrayList<Meme>)
+ getMemesViewed : ArrayList<Meme>
+ setMemesViewed(memesViewed : ArrayList<Meme>)
+ rateMeme(m : Meme, rating int)
+ createMeme(b : BackgroundImage, caption : String) : null
+ deleteMeme(m : Meme) : boolean
+ shareMeme(m : Meme, f : Feed)
+ rateNextMeme(f : Feed, ratingScore : int)
+ calculateReputation() : double
*/

import java.util.ArrayList;

public class User {
	private String userName;
	private ArrayList<Meme> memesCreated;
	private ArrayList<Meme> memesViewed;

	public User() {
		
		userName = "";
		memesCreated = new ArrayList<Meme>();
		memesViewed = new ArrayList<Meme>();
	}
	public User(String userName) {
		this.userName=userName;
		memesCreated = new ArrayList<Meme>();
		memesViewed = new ArrayList<Meme>();
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ArrayList<Meme> getMemesCreated() {
		return memesCreated;
	}

	@Override
	//checks if the other object is a User and has the 
	//same values for private variables
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	//prints the userName of the User
	public String toString() {
		return this.userName + " has rated " + "(" + this.memesViewed.size()+")" + " memes, " + "(" + calculateReputation() + ")";
	}

	public void setMemesCreated(ArrayList<Meme> memesCreated) {
		this.memesCreated = memesCreated;
	}

	public ArrayList<Meme> getMemesViewed() {
		return memesViewed;
	}

	public void setMemesViewed(ArrayList<Meme> memesViewed) {
		this.memesViewed = memesViewed;
	}

	public void rateMeme(Meme m, int rating) {
	};

	public Meme createMeme(BackgroundImage b, String caption) {
		Meme newMeme = new Meme(b,caption,this);
		this.memesCreated.add(newMeme);
		return newMeme;
	}

	public boolean deleteMeme(Meme m) {
		if(memesCreated.contains(m) && !m.getShared()) {
			memesCreated.remove(m);
			return true;
		}
		return false;
	}

	public void shareMeme(Meme m, Feed f) {
		m.setShared(true);
		f.getMemes().add(m);
	}

	public void rateNextMeme(Feed f, int ratingScore) {
		Meme newMeme = f.getNewMeme(this);
		Rating r = new Rating(this, ratingScore);
		if(newMeme!=null) {
			newMeme.getRatings().add(r);
		}
		else
			System.out.println("No new memes to view.");
	}

	public double calculateReputation() {
		double rep = 0.0;
		for(Meme m : this.memesCreated) {
			rep+=m.calculateRating();
		}
		return rep;
	}
}