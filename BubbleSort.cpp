/*
 * Bubble sort
 */

#include<iostream>
using namespace std;

class BubbleSort{

	public:
	
	void swap(int *x, int *y){
		int temp = *x;
		*x = *y;
		*y = temp; 
	}
	
	
	void printArray(int array[], int length){
		for(int i = 0; i < length; i++){
			cout << array[i] << "\t";
		}
	}
	
	void sort(int array[], int length){
		
		int temp;
		
		for(int i=length-1; i>=0; i--){
			
			for(int j=i; j>=0; j--){
				
				if(array[j] < array[j+1]){
					swap(&array[j], &array[j+1]);
				}
			}
		}
		
		printArray(array, length);
	}
};

int main(){
	
	int array[] = {64, 34, 25, 12, 22, 11, 90};
	int length = sizeof(array) / sizeof(array[0]);
	
	BubbleSort obj;
	obj.sort(array, length);
	
	return 0;
}
