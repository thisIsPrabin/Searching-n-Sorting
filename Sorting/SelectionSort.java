import java.util.Scanner;
public class SelectionSort {
	
	public void sort(int arr[]){
		for(int i=0; i<arr.length; i++){
			int j = i;
			
			for(int k=i+1; k<arr.length; k++){
				if(arr[j] > arr[k]){
					j = k;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			printArray(arr);
		}
	}
	
	public void printArray(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String...strings){
		
		SelectionSort obj = new SelectionSort();
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++){
			arr[i] = in.nextInt();
		}
		obj.sort(arr);
		in.close();
	}
}
