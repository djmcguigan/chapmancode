#ifndef HEAP_H
#define HEAP_H

#include <stdio.h>
#include <stdlib.h>



void heapInsert(double num, double* arr, int currentEnd);
double heapRemove1(double* arr, int currentEnd);
void heapSort1(double* arr, int size);


#endif