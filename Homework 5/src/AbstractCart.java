import java.util.ArrayList;
import java.util.HashMap;
/**
 * The Abstract Cart class represents a user's cart. Items of Type T can be added 
 * or removed from the cart. A hashmap is used to keep track of the number of items
 * that have been added to the cart example 2 apples or 4 shirts. 
 * @author Your friendly CS Profs
 * @param <T> -Type of items that will be placed in the Cart.
 */
 public abstract class AbstractCart<T> {

	protected HashMap<T,Integer> cart;
	
	public AbstractCart() {
		this.cart = new HashMap<T,Integer>();
	}
	
	/**
	 * Calculates the total value of items in the cart.
	 * @return total (double) 
	 */
	public abstract double calculateTotal();
	
	/**
	 * Add an item of type T to the Cart (HashMap: The product is the key 
	 * and the value is the count).
	 * If product doesn't exist in the cart add it and set count to one. 
	 * Otherwise increment the value.  
	 * @param item
	 * @return boolean
	 */
	public void addItem(T item) {
		 //TODO: Implement this
		if(cart.containsKey(item)) {
			int count = this.cart.get(item);
			count++;
			this.cart.put(item, count);
		}
		else {
			this.cart.put(item, 1);
		}
	}
	
	/**
	 * Adds every item in the Arraylist of Type T or any subclass of T. 
	 * @param items: An array of items 
	 * @return true if items have been currently added. 
	 */
	public void addItems(ArrayList<? extends T> items) {
		   //TODO: Implement this
		for(T item : items) {
			/* if(cart.containsKey(item)) {
				int count = this.cart.get(item);
				count++;
				this.cart.put(item, count);
			} 
			else { */
				this.cart.put(item, 1);
			}
		}
	// }
	/**
	 * Removes an item of type T from the list.
	 * If the only one item, we remove that item.
	 * If item count is greater than one decrement the count.
	 * If you are able to remove the item then return true.
	 * If the item doesn't exist return false.  
	 * @param item
	 * @return true 
	 * in the list. 
	 */
	public boolean removeItem(T item) {
	   //TODO: Implement this
		if(!this.cart.containsKey(item)) {
			return false;
		}
		else {
			if(this.cart.get(item)==1) {
				this.cart.remove(item);
			}
			else {
				this.cart.put(item, this.cart.get(item)-1);
			}
			return true;
		}
	}
	
	
	/**
	 * Removes all of the item of items of Type T or any subclass of T from the cart. 
	 * @param item
	 * @return true if items have been successfully remove. 
	 */
	public boolean removeItems(ArrayList<? extends T> items) {
		   //TODO: Implement this
		boolean ret = true;
		for(T item : items) {
			
			if(!this.cart.containsKey(item)) {
				ret = false;
			}
			else {
				if(this.cart.get(item)==1) {
					this.cart.remove(item);
				}
				else {
					this.cart.put(item, this.cart.get(item)-1);
				}
			}
		}
		return ret;
	}
	
	/**
	 * Check to see if the cart contains an item. 
	 * @param item
	 * @return true if cart contains the item. Returns False otherwize
	 */
	public boolean contains(T item) {
		return cart.containsKey(item);
	}
	

	
}
