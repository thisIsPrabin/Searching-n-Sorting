import java.util.Scanner;
class QuickSort {

	public int partition(int array[], int low, int high){
		
		int i = (low-1);
		int p = array[high];
		
		for(int j=low; j<=high-1; j++){
			
			if(array[j] <= p){
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		
		return i+1;
	}
	
	public void sort(int array[], int low, int high){
		
		if(low < high){
			
			int pi = partition(array, low, high);
			sort(array, low, pi-1);
			sort(array, pi+1, high);
		}
	}
	
	
	public static void printArray(int array[], int low, int high){
		for(int i=low; i<high; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String...strings){
		
		Scanner in = new Scanner(System.in);
	        QuickSort ob = new QuickSort();
	        
	        int size = in.nextInt();
	        int[] arr = new int[size];
	        
	        for(int i=0; i<size; i++){
	        	arr[i] = in.nextInt();
	        }
	        
	        ob.sort(arr, 0, size-1);
	        
	        printArray(arr, 0, size);
	        in.close();
	}
}
