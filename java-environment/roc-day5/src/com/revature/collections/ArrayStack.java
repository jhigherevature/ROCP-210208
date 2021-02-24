package com.revature.collections;


/*
 * An array-based structure that can increase in size if we add
 * more elements than the underlying array can hold
 * 
 */
public class ArrayStack {
	// Data is our collection of information
	// we choose 5 as an arbitrary default value
	private Integer[] data = new Integer[5];
	
	private int oneGreaterThanLastIndex = 0;
	
	// Push is used to add info to our collection
	public void push(Integer input) {
		// We need to determine if our current collection, is big
		// enough to hold onto the new input data
		if (oneGreaterThanLastIndex >= data.length) {
			// we need to create a new Bigger array
			// we arbitrarily double the size 
			Integer[] newData = new Integer[data.length * 2];
			
			// populate newData with info from [old] data
			for(int i = 0; i < data.length; i++) {
				newData[i] = data[i];
				// newData[0] = data[0]
				// newData[1] = data[1]
				// newData[2] = data[2]
				// ...
			}
			
			// update reference of our [old] data to the memory address
			//  of the newData
			data = newData;
		}
		
		data[oneGreaterThanLastIndex] = input;
		++oneGreaterThanLastIndex;
	}
	
	// We manipulate 'oneGreaterThanLastIndex' to 'remove' information
	// from the collection... This data doesn't actually get removed,
	// but, as far as our users are concerned, they will never see the
	// data that we pop
	public Integer pop() {
		if (oneGreaterThanLastIndex <= 0) {
			return null;
		}
		
		--oneGreaterThanLastIndex;
		return data[oneGreaterThanLastIndex];
	}
	
	public Integer peek() {
		return data[oneGreaterThanLastIndex-1];
	}
}
