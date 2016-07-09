/*
 * Binary search
 */

#include<iostream>
using namespace std;

int binarySearch(int array[], int left, int right, int key){
	
	int i, mid;
	mid = (right+1) / 2;
	
	if(array[mid] == key){
		return mid;
	}
	
	if(array[mid] > key){
		
		for(i=left; i<mid; i++){
			if(array[i] == key){
				break;
			}
		}
		
		if(array[i] == key){
			return i;
		} else {
			return -1;
		}
	}
	
	if(array[mid] < key){
		
		for(i=mid; i<=right; i++){
			if(array[i] == key){
				break;
			}
		}
		
		if(array[i] == key){
			return i;
		} else {
			return -1;
		}
	}
	
	return -1;
}

int main(){
	
	int ack;
	int array[5] = {1, 2, 3, 4, 5};
	
	ack = binarySearch(array, 0, 4, 5);
	
	cout << ack;
	return 0;
}
