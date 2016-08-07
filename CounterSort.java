import java.util.Scanner;
public class CounterSort {
	
	public void sort(int arr[], int range){
		int[] output = new int[arr.length];
		int[] count = new int[range];
		
		for(int i=0; i<arr.length; i++){
			count[arr[i]]++;
		}
		
		for(int i=1; i<range; i++){
			count[i] = count[i]+count[i-1];
		}
		
		for(int i=0; i<arr.length; i++){
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		printArray(output);
	}
	
	public static void printArray(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String...strings){
		Scanner in = new Scanner(System.in);
		CounterSort obj = new CounterSort();
		
		System.out.println("Enter the size of the array - ");
		int size = in.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the values in the array - ");
		for(int i=0; i<arr.length; i++){
			arr[i] = in.nextInt();
		}
		
		System.out.println("Enter the range - ");
		int range = in.nextInt();
		
		obj.sort(arr, range);
		in.close();
	}
}
