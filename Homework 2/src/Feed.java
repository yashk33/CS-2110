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
		for (Meme m : memes) {
			if (!(u.getMemesViewed().contains(m)) && !(u.getMemesCreated().contains(m)))
				return m;
		}
		return null;
	}

	@Override
	public String toString() {
		String ret = "";
		for (Meme m : memes) {
			ret += m.toString() + "\n";
		}
		return ret;
	}

	public static void main(String args[]) {
		Feed f = new Feed();

		User u1 = new User();
		User u2 = new User();
		User u3 = new User();

		BackgroundImage b1 = new BackgroundImage();
		BackgroundImage b2 = new BackgroundImage();
		BackgroundImage b3 = new BackgroundImage();

		String temp = "";
		u1.createMeme(b1, temp);
		u1.createMeme(b2, temp);
		u1.createMeme(b3, temp);

		u2.createMeme(b1, temp);
		u2.createMeme(b2, temp);
		u2.createMeme(b3, temp);

		u3.createMeme(b1, temp);
		u3.createMeme(b2, temp);
		u3.createMeme(b3, temp);

		for (Meme m : u1.getMemesCreated()) {
			u1.shareMeme(m, f);
		}

		for (Meme m : u2.getMemesCreated()) {
			u2.shareMeme(m, f);
		}

		for (Meme m : u3.getMemesCreated()) {
			u3.shareMeme(m, f);
		}

		for (int i = 0; i < 9; i++) {
			u1.rateNextMeme(f, ((int) Math.random()) * 2 - 1);
			u2.rateNextMeme(f, ((int) Math.random()) * 2 - 1);
			u3.rateNextMeme(f, ((int) Math.random()) * 2 - 1);
		}

		for (Meme m : u1.getMemesCreated()) {
			System.out.println(m);
		}

		for (Meme m : u2.getMemesCreated()) {
			System.out.println(m);
		}

		for (Meme m : u3.getMemesCreated()) {
			System.out.println(m);
		}

		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);

	}

}
