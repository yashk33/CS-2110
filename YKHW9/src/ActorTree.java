/**
 * This is the class you will create
 * 
 * @author Your friendly CS professors
 *
 */
public class ActorTree {
	/**
	 * ActorTree has only one property, the root node
	 */
	Node root;

	/**
	 * Initialize the root node in the default constructor
	 */
	public ActorTree() {
		root = new Node();
	}

	/**
	 * 
	 * @param name - the name to find
	 * @return the matching Actor object
	 */
	public Actor find(String name) {
		return root.find(name);
	}

	/**
	 * 
	 * @return an int representing 1 for each node in the tree
	 * 
	 */
	public int size() {
		return root.size();
	}

	/**
	 * 
	 * @return an int representing the maximum height of any branch
	 */
	public int height() {
		return root.height();
	}

	/**
	 * an empty tree is one with no data
	 * 
	 * @return boolean - True if the tree is empty
	 */
	public boolean isEmpty() {
		if (root == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param a - an Actor object
	 * @return boolean - True if the element was inserted
	 */
	public boolean insert(Actor a) {
		return root.insert(a);
	}

	/**
	 * In order Traversal
	 */
	public String inOrder() {
		return root.inOrder();
	}

	/**
	 * The Node class is an inner class of the ActorTree This is a Binary Search
	 * Tree, so each Node will have left and right children
	 * 
	 * @author Your friendly CS Professors
	 *
	 */
	class Node {
		Actor actor;
		Node left;
		Node right;

		/**
		 * default constructor
		 */
		public Node() {

		}

		/**
		 * Constructor that takes an Actor object
		 * 
		 * @param a - an Actor left and right children are initialized to null
		 */
		public Node(Actor a) {
			actor = a;
		}

		/**
		 * The size method is recursive
		 * 
		 * @return an int to represent a count of all nodes
		 */
		public int size() {
			int ret = 0;
			if (this.actor == null)
				return ret;
			if (left != null) {
				ret += left.size();
			}
			if (right != null) {
				ret += right.size();
			}
			return ret + 1;
		}

		/**
		 * The height method is recursive
		 * 
		 * @return an int to represent the maximum height of right or left child nodes,
		 *         plus 1 for the current node
		 */
		public int height() {
			if (this.actor == null)
				return 0;
			int ret = 1;
			if (left != null) {
				ret = left.height() + 1;
			}
			if (right != null) {
				if (right.height() + 1 > ret)
					ret = right.height() + 1;
			}
			return ret;
		}

		/**
		 * The insert method finds the best place to insert the Actor argument
		 * 
		 * @param a - an Actor to insert
		 * @return boolean - True if the Actor argument was added, false otherwise
		 */
		public boolean insert(Actor a) {
			Node current = this;
			
			if (this == null) {
				this.actor = a;
				return true;
			}

			while (true) {
				if (a.compareTo(current.actor) < 0) {
					if (current.left != null)
						current = current.left;
					else {
						current.left.actor = a;
						return true;
					}
				} 
				
				else if (a.compareTo(current.actor) > 0) {
					if (current.right != null)
						current = current.right;
					else {
						current.right.actor = a;
						return true;
					}
				} 
				
				else
					break;
			}
			
			return false;

			/*
			 * Node current = this; if(this.actor==null) { this.actor = a; return true; }
			 * while(current!=null) { if(a.compareTo(current.actor)==0) {
			 * if(current.left==null) { current.left=new Node(a); return true; } current =
			 * current.left; } else if(a.compareTo(current.actor)<0) {
			 * if(current.left==null) { current.left = new Node(a); return true; } current =
			 * current.left; } else if(current.right==null) { current.right = new Node(a);
			 * return true; } current = current.right;
			 * 
			 * } return false;
			 */
		}

		/**
		 * The find method returns an Actor object with a matching name
		 * 
		 * @param name - the name to search for
		 * @return the searched for Actor, or null
		 */
		public Actor find(String name) {
			Node current = this;
			if (current.actor == null)
				return null;
			while (current != null) {
				if (name.compareTo(current.actor.primaryName) == 0)
					return current.actor;
				else if (name.compareTo(current.actor.primaryName) < 0) {
					current = current.left;
				} else
					current = current.right;

			}
			return null;
		}

		public String inOrder() {
			String ret = "";
			if (this.actor == null)
				return ret;
			if (this.left != null) {
				if (ret == "")
					ret = this.left.inOrder();
				else
					ret = ret + "\n" + this.left.inOrder();
			}
			if (this.right != null) {
				if (ret == "")
					ret = this.right.inOrder();
				else
					ret = ret + "\n" + this.right.inOrder();
			}
			return ret + this.actor.primaryName;
		}
	}

}
