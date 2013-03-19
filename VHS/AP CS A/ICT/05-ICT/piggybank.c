#include "piggybank.h"

int myPennies = 0, myNickels = 0, myDimes = 0, myQuarters = 0;

int getNumPennies(){
	return myPennies;
}

int getNumNickels(){
	return myNickels;
}

int getNumDimes(){
	return myDimes;
}

int getNumQuarters(){
	return myQuarters;
}

void addChange(int pennies, int nickels, int dimes, int quarters){
	myPennies += pennies;
	myNickels += nickels;
	myDimes += dimes;
	myQuarters += quarters;
}

double getBalance(){
	return (.01 * myPennies) + (.05 * myNickels) + (.10 * myDimes) + (.25 * myQuarters);
}