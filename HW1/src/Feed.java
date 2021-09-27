import java.util.ArrayList;
/*
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md

Feed
--------------------------------------------
- memes: ArrayList<Meme>
--------------------------------------------
+ Feed()
+ setMeme(m : ArrayList<Meme>)
+ getMeme() : Meme
+ getNewMeme(u : User) : Meme
+ toString() : String


*/

public class Feed {

	private ArrayList<Meme> memes;

	public Feed() {
		memes = new ArrayList<Meme>();
	}

	public ArrayList<Meme> getMemes() {
		return memes;
	}

	public void setMemes(ArrayList<Meme> m) {
		this.memes = m;
	}

	public Meme getNewMeme(User u) {
		return null;
	}

	@Override
	// Prints the fields of the object in sentence form
	public String toString() {
		return "";
	}

}
