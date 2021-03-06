package eg.edu.alexu.csd.filestructure.sort;

import java.util.ArrayList;

public interface ISort<T extends Comparable<T>> {

	/**
	* Sorts the given collection of elements using heap-sort algorithm in-place,
	* and returns a clone of the complete heap that you constructed during
	* the sorting, and before you empty it.
	* Runs in O(n lg n) time
	* @param unordered unordered elements
	* @return heap structure used
	*/
	IHeap<T> heapSort(ArrayList<T> unordered);
	/**
	* Sorts the given collection of elements using any O(n^2) algorithm in-place
	* @param unordered unordered elements
	*/
	void sortSlow(ArrayList<T> unordered);
	/**
	* Sorts the given collection of elements using any O(n lg n) algorithm in-place
	* @param unordered unordered elements
	*/
	void sortFast(ArrayList<T> unordered);
	
}