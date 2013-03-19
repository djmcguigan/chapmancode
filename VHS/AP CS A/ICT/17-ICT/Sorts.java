
import java.util.*;

/**
 *  Description of the Class
 *
 * @author     Your Name Here
 * @created    Month Day, Year
 */
public class Sorts{
	private long steps;
	
	/**
	 *  Description of Constructor
	 *
	 * @param  list  Description of Parameter
	 */
	public Sorts(){
		steps = 0;
	}
	
	/**
	 *  Description of the Method
	 *
	 * @param  list  reference to an array of integers to be sorted
	 */
	public void bubbleSort(ArrayList <Comparable> list){
		for (int outer = 0; outer < list.size() - 1; outer++){
			for (int inner = 0; inner < list.size()-outer-1; inner++){
				if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
					swap(list, inner, inner+1);
				}
			}
		}
	}
	
	
	/**
	 *  Description of the Method
	 *
	 * @param  list  reference to an array of integers to be sorted
	 */
	public void selectionSort(ArrayList <Comparable> list){
		int min; 
		Comparable temp;
		
		for (int outer = 0; outer < list.size() - 1; outer++){
			min = outer;
			for (int inner = outer + 1; inner < list.size(); inner++){
				if (list.get(inner).compareTo(list.get(min)) < 0) {
					min = inner;  // a new smallest item is found
				}
			}
			swap(list, outer, min);
		}
	}
	
	
	/**
	 *  Description of the Method
	 *
	 * @param  list  reference to an array of integers to be sorted
	 */
	public void insertionSort(ArrayList <Comparable> list){
		for (int outer = 1; outer < list.size(); outer++){
			int position = outer;
			Comparable key = list.get(position);
			
			// Shift larger values to the right
			while (position > 0 && list.get(position - 1).compareTo(key) > 0){
				list.set(position, list.get(position - 1));
				position--;
			}
			list.set(position,  key);
		}
	}
	
	
	
	/**
	 *  Takes in entire vector, but will merge the following sections
	 *  together:  Left sublist from a[first]..a[mid], right sublist from
	 *  a[mid+1]..a[last].  Precondition:  each sublist is already in
	 *  ascending order
	 *
	 * @param  a      reference to an array of integers to be sorted
	 * @param  first  starting index of range of values to be sorted
	 * @param  mid    midpoint index of range of values to be sorted
	 * @param  last   last index of range of values to be sorted
	 */
	private  void merge(ArrayList <Comparable> list, int first, int mid, int last){
		ArrayList <Comparable> temp = new ArrayList <Comparable> (list);
		
		int indexA = first;
		int indexB = mid + 1;
		
		for(int index = first; index <= last; index++){
			if(indexA > mid){
				list.set(index, temp.get(indexB));
				indexB++;
			}
			else if(indexB > last){
				list.set(index, temp.get(indexA));
				indexA++;
			}
			else if(list.get(indexA).compareTo(list.get(indexB)) < 0){
				list.set(index, temp.get(indexA));
				indexA++;
			}
			else{
				list.set(index, temp.get(indexB));
				indexB++;
			}
		}
	}
	
	/**
	 *  Recursive mergesort of an array of integers
	 *
	 * @param  a      reference to an array of integers to be sorted
	 * @param  first  starting index of range of values to be sorted
	 * @param  last   ending index of range of values to be sorted
	 */
	
	public void mergeSort (ArrayList <Comparable> list, int first, int last){
		if(last - first == 0){}
		else if(last - first == 1){
			if(list.get(first).compareTo(list.get(last)) > 0){
				swap(list, first, last);
			}
		}
		else{
			int  mid;
			mid = (first + last) / 2;
			mergeSort (list, first, mid);
			mergeSort (list, mid+1, last);
			merge (list, first, mid, last);
		}
	}
	
    
	
	
	/**
	 *  Accessor method to return the current value of steps
	 *
	 */
	public long getStepCount(){
		return steps;
	}
	
	/**
	 *  Modifier method to set or reset the step count. Usually called
	 *  prior to invocation of a sort method.
	 *
	 * @param  stepCount   value assigned to steps
	 */
	public void setStepCount(long stepCount){
		steps = stepCount;
	}
	
	/**
	 *  Interchanges two elements in an ArrayList
	 *
	 * @param  list  reference to an array of integers
	 * @param  a     index of integer to be swapped
	 * @param  b     index of integer to be swapped
	 */
	public void swap(ArrayList <Comparable> list, int a, int b){
		Comparable temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}
}
