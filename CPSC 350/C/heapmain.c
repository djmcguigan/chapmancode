#include "heap.h"

int main(int argc, char** argv){
	int bob[10];
	bob[0] = 6;
	bob[1] = 3;
	bob[2] = 8;
	bob[3] = 1;
	bob[4] = 30;
	bob[5] = 100;
	bob[6] = 2;
	bob[7] = 87;
	bob[8] = 9;
	bob[9] = 0;
	
	printf("%s \n", "BEFORE");
	int b = 0;
	for(b; b < 10; b++)
		printf("%d \n", bob[b]);
	
	heapSort(bob, 10);
	
	printf("%s \n", "AFTER");
	int c = 0;
	for(c; c < 10; c++)
		printf("%d \n", bob[c]);
	
	return 1;
}