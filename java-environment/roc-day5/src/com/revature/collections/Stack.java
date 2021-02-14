package com.revature.collections;

public class Stack<T> {
	Node top;
	
	// push is to add data
	public void push(Node node) {
		node.setNext(top);
		this.top = node;
	}
	
	// polymorphic method for convenience
	public void push(T data) {
		Node temp = new Node(data);
		push(temp);
	}
	
	// used to remove data
	public Node pop() {
		// popped is a reference to our current top, we are about to remove
		Node popped = top;
		
		// top.getNext() is the node that is second from the top, we want
		// this to be the new top
		top = top.getNext();
		
		// to tell our Node that is no longer belongs in our collection, we
		// set the next reference to nothing
		popped.setNext(null);
		
		
		return popped;
	}

	// allows us to look at data
	public Node peek() {
		return top;
	}
}
