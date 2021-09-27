/*
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md


Rating
--------------------
- score : int
- user : User
--------------------
+ Rating()
+ getScore() : int
+ getUser() : User
+ setScore(s : int)
+ setUser(u : User)
+ toString() : String
+ equals(obj : Object) : boolean

 
 */

public class Rating {

	private int score;
	private User user;

	public Rating() {
		score = 0;
		user = new User();
	}

	public Rating(User u, int i) {
		score = i;
		user = u;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int s) {
		if (s >= 1)
			this.score = 1;
		else if (s <= -1)
			this.score = -1;
		else 
			this.score = 0;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User u) {
		this.user = u;
	}

	// Prints the fields of the object in sentence form
	@Override
	public String toString() {
		return user.getUserName() + " rates " + score;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Rating other = (Rating) obj;
		if (this.getScore() != other.getScore())
			return false;
		if (this.getUser() == null) {
			if (other.getUser() != null)
				return false;
		} else if (!this.getUser().equals(other.getUser()))
			return false;
		return true;
	}
	public static void main(String[] args) {
		User u = new User();
		BackgroundImage b = new BackgroundImage();
		Feed f = new Feed();
		Meme m = new Meme();
		Rating r = new Rating();
		System.out.println(f);
	}

}
