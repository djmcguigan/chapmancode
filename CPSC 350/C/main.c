#include "mergeSort.h"

int main(int argc, char** argv){
	int tester[10];
	tester[0] = 2;
	tester[1] = 5;
	tester[2] = 49;
	tester[3] = 4;
	tester[4] = 5;
	tester[5] = 7;
	tester[6] = 1;
	tester[7] = 90;
	tester[8] = 80;
	tester[9] = 0;
	
	mergeSort(tester, 0, 9);
	
	int i;
	
	for(i = 0; i < 10; i++){
		printf("%d \t %d \n", i, tester[i]);
	}
	return 1;
}