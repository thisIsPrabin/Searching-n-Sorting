import java.util.Scanner;
public class BubbleSort {
	
	public void sort(int arr[]){
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				printArray(arr);
			}
		}
	}
	
	public void printArray(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String...strings){
		
		BubbleSort obj = new BubbleSort();
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
