/*
 * Cohort Group 4: Shriman S, Edward L, Hickson F, Yash K
 *  10/10/2020 5:00PM
*/ 

public class Sphere implements Solids {
	
	private double radius;
	private String color, name;
	
	public Sphere(double radius, String color, String name){
		this.radius = radius;
		this.color = color;
		this.name = name;
	}
	
	//Volume = 4/3*pi*r^3
	public double getVolume(){
		//TODO: complete this method (based on the formula above)
		return 4/3*(Math.PI)*Math.pow(this.radius, 3);
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