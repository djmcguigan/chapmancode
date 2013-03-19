#include "car.h"

int myStartMiles = 0, myEndMiles = 0;
double myGallons = 0;

void fillUp(int odometerReading, double gallons){
	myEndMiles = odometerReading;
	myGallons += gallons;
}

double calculateMPG(){
	return (myEndMiles - myStartMiles) / myGallons;
}

void resetMPG(){
	myStartMiles = myEndMiles;
	myGallons = 0;
}

int initialOdometer(){
	return myStartMiles;
}