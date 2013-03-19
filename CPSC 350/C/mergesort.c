#include "mergeSort.h"


void merge(int* arr, int first, int last){
	int i, j, k, mid, numValues;
	numValues = last - first + 1;
	int* temp = (int*)malloc(numValues*sizeof(int));
	k = 0;
	mid = (first+last)/2;
	for(i = first; i <= mid; i++){
		temp[k++] = arr[i];
	}
	for(j = last; j >= mid+1; j--){
		temp[k++] = arr[i];
	}
	i = 0;
	j = numValues-1;
	k = first;
	
	while(i <= j){
		if(temp[i] <= temp[j]){
			arr[k++] = temp[i++];
		}
		else{
			arr[k++] = temp[j--];
		}
	}
	free(temp);
}


void mergeSort(int* arr, int first, int last){
	if(first < last){
		int mid;
		mid = (first + last)/2;
		mergeSort(arr, first, mid);
		mergeSort(arr, mid+1, last);
		merge(arr, first, last);
	}
}
