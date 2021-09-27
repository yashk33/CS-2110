import java.util.LinkedList;

/*
Name: Shriman Selvamani, Hickson Frimpong, Edward Lue, Yash Kolli
Computing ID: ss5qt, haf3md , eyl4qaq, ysk6dw

*/


public class Queue {

	final int INITIAL_SIZE = 10;
	String[] elements;
	int currentSize, head, tail;
	
	public Queue(){
		this.elements = new String[this.INITIAL_SIZE];
		this.currentSize = this.head = this.tail = 0;
	}
	
	public void add(String s){
		// TODO: Complete this method to implement the add() method for a Queue
        growIfNecessary();
        elements[tail] = s;
        tail++;
	}
	
	public String remove(){
		String temp = elements[head];
		elements[head] = null;
		head++;
		return temp;
	}
	
	private void growIfNecessary(){
		if(currentSize == elements.length){
			String[] newElements = new String[2*elements.length];
			for(int i = 0; i < elements.length; i++){
				newElements[i] = elements[(head+i)%elements.length];
			}
			elements = newElements;
			head = 0;
			tail = currentSize;
		}
	}
	
	public String print() {
		String ret = "";
		for(int i = 0; i < elements.length; i++) {
			if(elements[i] != null)
			ret += elements[i];
		}
		return ret;
	}
	
	public static void main(String[] args) {
        // TODO: Use main-method testing to test your code!
        // Optional suggestion: Write a print method to show the contents of the queue and maybe even your pointers
		Queue q = new Queue();
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		System.out.println(q.print());
		q.remove();
		q.remove();
		System.out.println(q.print());
		q.add("E");
		System.out.println(q.print());
	}

}