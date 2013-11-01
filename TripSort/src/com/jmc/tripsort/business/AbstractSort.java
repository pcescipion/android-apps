package com.jmc.tripsort.business;


public abstract class AbstractSort<T> {

	protected T[] toSort;
	protected T[] helper;
	
	protected int number;
	
	public AbstractSort(T[] values){
		this.toSort = values;
		number = values.length;		
	}
	
	public void Sort() {
		mergeSort(0, number - 1);
	}

	protected void mergeSort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergeSort(low, middle);
			// Sort the right side of the array
			mergeSort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	protected abstract void merge(int low, int middle, int high);

}
