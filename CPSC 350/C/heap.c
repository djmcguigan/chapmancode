#include "heap.h"


void insert(int num, int* arr, int currentEnd){
	arr[++currentEnd] = num;
	int parent;
	int index = currentEnd;
	parent = (index - 1)/2;
	while(num > arr[parent]){
		int temp = arr[parent];
		arr[parent] = arr[index];
		arr[index] = temp;
		index = parent;
		parent = (index - 1)/2;
	}
}



int heapRemove(int* arr, int currentEnd){
	if(currentEnd == -1)
		return;
	int removal = arr[0];
	arr[0] = arr[currentEnd--];
	int childLeft;      // reference to location of left child
	int childRight;     // reference to location of right child
	int maxChild;		// reference to location of larger child
	int current = 0;    // reference to location of inserted int
	do{
		childLeft = 2*current + 1;
		childRight = 2*current + 2;
		if(arr[childLeft] > arr[childRight]){
			maxChild = childLeft;
		}
		else{
			maxChild = childRight;
		}
		
		if(arr[maxChild] > arr[current]){
			int temp = arr[current];
			arr[current] = arr[maxChild];
			arr[maxChild] = temp;
			current = maxChild;
		}
		}while(arr[childLeft] > arr[current] || arr[childRight] > arr[current]);
		
	arr[currentEnd+1] = -1;  /* Clear out used values */
	return removal;
}



void heapSort(int* arr, int size){
	int count = 0, size1;
	int* temp = (int*)malloc(size*sizeof(int));
	
	for(count; count < size; count++){
		insert(arr[count], temp, count-1);
	}
	count = 0;
	size1 = size;
	for(count; count < size; count++){
		arr[count] = heapRemove(temp, size1--);
	}
	free(temp);
}