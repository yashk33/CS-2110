/*
 * Cohort Group 4: Shriman S, Edward L, Hickson F, Yash K
 *  10/10/2020 5:00PM
*/ 
public class Cuboid implements Solids {

	private double length, width, height;
	
	private String color, name;
	
	public Cuboid(double length, double width, double height, String color, String name){
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
		this.name = name;
	}
	
	//Volume = length*width*height
	public double getVolume(){
		//TODO: complete this method (based on the formula above)
		return this.length*this.width*this.height;
	}
	
	public String getColor(){
		//TODO: complete this method
		return this.color;
	}
	
	public String getName(){
		//TODO: complete this method
		return this.name;
	}
	
}