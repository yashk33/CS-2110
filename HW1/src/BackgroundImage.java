/*
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md


BackgroundImage
-------------------------
- imageFileName: String
- title: String
- description: String
--------------------------
+ BackgroundImage()
+ getImageFileName() : String
+ setImageFileName(ImageFileName: String)
+ getTitle(): String
+ setTitle(title: String)
+ getDescription() : String
+ setDescription(description : String)
+ equals(obj) : boolean
+ toString() : String
*/

public class BackgroundImage {
	private String imageFileName;
	private String title;
	private String description;

	public BackgroundImage() {
		imageFileName = null;
		title = null;
		description = null;
	}
	
	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName;
	}

	/**
	 * @param imageFileName the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	//Checks if the other object is a BackgroundImage and has the same matching fields
	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false; BackgroundImage other = (BackgroundImage)
		 * obj; if (description == null) { if (other.description != null) return false;
		 * } else if (!description.equals(other.description)) return false; if
		 * (imageFileName == null) { if (other.imageFileName != null) return false; }
		 * else if (!imageFileName.equals(other.imageFileName)) return false; if (title
		 * == null) { if (other.title != null) return false; } else if
		 * (!title.equals(other.title)) return false;
		 */
		return true;
	}

	//Prints the fields of the object in sentence form
	@Override
	public String toString() {
		/*
		 * return "BackgroundImage [Image File Name = " + imageFileName + ", Title = " +
		 * title + ", Description = " + description + "]";
		 */
		return "";
	}

}