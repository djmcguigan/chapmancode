/*
 *  CoinAmounts.c
 *  
 *
 *  Created by Daniel McGuigan on 19.11.10.
 *  Copyright 2010 __MyCompanyName__. All rights reserved.
 *
 */

#include "CoinAmounts.h"

void findChange(int change){
	printf("%d", change);
	
	int q, d, n, p;
	q = change/25;
	d = (change % 25)/10;
	n = ((change % 25) % 10)/5;
	p = (((change % 25) % 10) % 5)/1;
	
	printf("\n %d", q);
	printf("\n %d", d);
	printf("\n %d", n);
	printf("\n %d \n", p);
}

