import java.util.Scanner;

public class InsertionSort {
	
	public void sort(int arr[]){
		for(int i=0; i<arr.length; i++){
			
			int j = i;
			while(j>0){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}	
				j--;
			}
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
		
		InsertionSort obj = new InsertionSort();
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
