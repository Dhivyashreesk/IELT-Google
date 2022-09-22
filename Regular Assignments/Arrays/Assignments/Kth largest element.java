// Java program of Quick Select
import java.util.Arrays;
import java.util.Scanner;
class Solution {
	// partition function similar to quick sort
	public static int partition(int[] arr, int low,int high)
	{
		int pivot = arr[high], pivotloc = low;
		for (int i = low; i <= high; i++) {
			// inserting elements of less value
			// to the left of the pivot location
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[pivotloc];
				arr[pivotloc] = temp;
				pivotloc++;
			}
		}

		// swapping pivot to the final pivot location
		int temp = arr[high];
		arr[high] = arr[pivotloc];
		arr[pivotloc] = temp;

		return pivotloc;
	}
	public static int kthLargest(int[] arr, int low,int high, int k)
	{
		// find the partition
		int partition = partition(arr, low, high);

		// if partition value is equal to the kth position,
		// return value at k.
		if (partition == (high+1)-k)
			return arr[partition];

		// if partition value is less than (n-k)th position,
		// search right side of the array.
		else if (partition < (high-k)+1)
			 return kthLargest(arr, partition + 1, high, k);

		// if partition value is more than (n-k)th position,
		// search left side of the array.
		else
		    return kthLargest(arr, low, partition - 1, k);
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int kPosition=sc.nextInt();
		if (kPosition > n) {
			System.out.println("Index out of bound");
		}
		else {
			// find kth largest value
			System.out.println(
				kPosition+"th largest element in the array : "
				+ kthLargest(arr, 0, n- 1,
							kPosition));
		}
	}
}
