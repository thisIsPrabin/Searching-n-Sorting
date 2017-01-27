import java.util.Scanner;

public class MergeSort {

	public void merge(int low, int mid, int high, int a[]){
		
		int i = low, j = mid+1, k = 0;
		int length = (int)(high - low) + 1;
		
		int[] b = new int[length];
		
		while(i <= mid && j <= high){
			if(a[i] <= a[j]){
				b[k] = a[i];
				i++;
			} else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		
		while(i <= mid){
			b[k] = a[i];
			i++;
			k++;
		}
		
		while(j <= high){
			b[k] = a[j];
			j++;
			k++;
		}
		
		k = low;
		for(i = 0; i < length; i++){
			a[k] = b[i];
			k++;
		}
	}
	
	public void sort(int low, int high, int array[]){
		
		int mid = (int) (high + low) / 2;
		
		if(low < high){
			
			sort(low, mid, array);
			sort(mid+1, high, array);
			
			merge(low, mid, high, array);
		}
	}
	
	public void printArray(int array[]){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
		
	}
	
	public static void main(String... args){
		
		Scanner out = new Scanner(System.in);
		System.out.println("Enter the size of the array - ");
		int size = out.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter the elements");
		
		for(int i = 0; i < size; i++){
			array[i] = out.nextInt();
		}
		
		MergeSort obj = new MergeSort();
		obj.sort(0, 4, array);
		
		obj.printArray(array);
		out.close();
	}
}
