/*
 
Name: Shriman Selvamani, Edward Lue, Yash Kolli, Hickson Frimpong
Computing ID: ss5qt, eyl4qaq , ysk6dw, haf3md

UML Diagram 

Microwave
-----------------------------
- timeRemaining: int
- isOccupied :Boolean
------------------------------
+ cook(seconds : int)
+ defrost(minutes : int)
+ pop()
+getTimeRemaining() : int
+getOccupied() : boolean
+setTimeRemaining(seconds : int)
+setOccupied(occupied : boolean)

*/


public class Microwave{

	private int timeRemaining;
	private boolean isOccupied;

	public int  getTimeRemaining() {return 0;}; //Temporary return statement for no errors

	public boolean getOccupied() {return true;}; //Temporary return statement for no errors

	public void setTimeRemaining(int seconds){}; 

	public void setOccupied(boolean occupied){};

	public void defrost(int minutes) {}; 

	public void cook(int seconds){};

	public void pop() {};

}
