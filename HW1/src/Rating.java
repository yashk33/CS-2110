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
		user = null;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int s) {
		this.score = s;
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
		return "";
	}

	@Override
	// Checks if the other object is a Rating and has the same matching fields
	public boolean equals(Object obj) {
		/*
		 * 
		 * Rating other = (Rating) obj;
		 * 
		 * if (this == obj) return true;
		 * 
		 * if (obj == null || getClass() != obj.getClass() || score != other.score)
		 * return false;
		 * 
		 * if (user == null) { if (other.user != null) return false; }
		 * 
		 * else if (!user.equals(other.user)) return false;
		 * 
		 */

		return true;
	}

}
