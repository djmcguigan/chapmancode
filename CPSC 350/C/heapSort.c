#include "heap.h"

int* heapSort(int* arr, int size){
	int count = 0;
	int* temp = (int*)malloc(size*sizeof(int));
	
	for(count=0; count < size; count++){
		insert(arr[count], temp, count-1);
	}
}