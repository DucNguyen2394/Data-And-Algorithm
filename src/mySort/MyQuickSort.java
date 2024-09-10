package mySort;

public class MyQuickSort {

	public static void sort(int[] arr, int l, int r) {
		if( l > r) {
			return;
		}
		int key = arr[(l + r )/ 2];
		
		sort(arr , 0 , key - 1);
		sort(arr, key, arr.length - 1);
	}
	
	public static int partition() {
		
		return 0;
	}
	
	public static void main(String[] args) {
		int[] arr = {9,7,4,2,6,7,2,1,4,5};
		System.err.println("Beofe sort :");
		for(int i = 0; i < arr.length ; i ++) {
			
			System.err.print(arr[i] + ",");
		}
		System.err.println("After sort :");
		
		sort(arr, 0 , arr.length - 1);
		
		for(int i = 0; i < arr.length ; i ++) {
			
			System.err.print(arr[i] + ",");
		}
	}
}
