#include "car.h"

int main(int argc, char** argv){
	
	printf("%s \t %f \n", "New car odometer reading: ", calculateMPG());
	fillUp(150,8);
	printf("%s \t %f \n", "Miles per gallon: ", calculateMPG());
	printf("%s \t %f \n", "Miles per gallon: ", calculateMPG());
	resetMPG();
	fillUp(350, 10);
	fillUp(450, 20);
	printf("%s \t %f \n", "Miles per gallon: ", calculateMPG());
	resetMPG();
	fillUp(603, 25.5);
	printf("%s \t %f \n", "Miles per gallon: ", calculateMPG());
}