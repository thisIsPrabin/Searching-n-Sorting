#include<iostream>
using namespace std;


int select(int arr[], int i){
	
	for(int left = i; left >= 0; left--){
		if(arr[i] < arr[left]){
			
			i = left;
		}
	}
	
	return i;
}


void swap(int *xp, int *yp){
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}


void selectionSort(int arr[], int n) {
   int i, j;
   for (i = n-1; i >=0; i--)     {
        int j = select(arr, i);     
        swap(&arr[i], &arr[j]);
   }
   
   
   for (i = 0; i < n; i++)     {
    	cout << arr[i] << "\t";
   }
}


int main(){
	
	int array[6] = {22, 4, 1, 55, 10, 98};
	
	selectionSort(array, 6);
	return 0;
}
