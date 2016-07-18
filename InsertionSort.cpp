#include<iostream>
using namespace std;

class InsertionSort {

	public:

	void sort(int array[], int length){
		
		int temp;
		
		for(int i=0; i<=length-1; i++){
			for(int j=i; j>=0; j--){
				
				if(array[j-1] > array[j]){
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
			
		for(int i=0; i<length; i++){
			cout << array[i] << "\t";
		}
	}
};


int main(){
	
	int array[] = {98, 1, 45, 38, 22};
	int length = sizeof(array) / sizeof(array[0]);
	
	InsertionSort obj;
	obj.sort(array, length);
	
	return 0;
}
