import java.util.Scanner;
public class RadixSort {
	
	public int getMax(int arr[]){
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	public void countSort(int arr[], int length, int exp){
		int[] output = new int[length];
		int[] count = new int[10];
		
		for(int i=0; i<length; i++){
			count[(arr[i]/exp)%10]++;
		}
		
		for(int i=1; i<10; i++){
			count[i] = count[i] + count[i-1];
		}
		
		for(int i=length-1; i>=0; i--){
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}
		
		for(int i=0; i<length; i++){
			arr[i] = output[i];
		}
	}
	
	public void radixSort(int arr[], int length){
		int max = getMax(arr);
		for(int exp=1; max/exp>0; exp *= 10){
			countSort(arr, length, exp);
		}
	}
	
	public static void printList(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String...strings){
		
		Scanner in = new Scanner(System.in);
		RadixSort obj = new RadixSort();
		
		System.out.println("Enter the size of the array - ");
		int size = in.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = in.nextInt();
		}
		obj.radixSort(arr, size);
		printList(arr);
		in.close();
	}
}
