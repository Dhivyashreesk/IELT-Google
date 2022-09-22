// Java program of Quick Select
import java.util.Arrays;
import java.util.Scanner;
class Solution {
	// partition function similar to quick sort
	// Considers last element as pivot and adds
	// elements with less value to the left and
	// high value to the right and also changes
	// the pivot position to its respective position
	// in the final array.
	public static int partition(int[] arr, int low,
								int high)
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

	// finds the kth position (of the sorted array)
	// in a given unsorted array i.e this function
	// can be used to find both kth largest and
	// kth smallest element in the array.
	// ASSUMPTION: all elements in arr[] are distinct
	public static int kthSmallest(int[] arr, int low,
								int high, int k)
	{
		// find the partition
		int partition = partition(arr, low, high);

		// if partition value is equal to the kth position,
		// return value at k.
		if (partition == k - 1)
			return arr[partition];

		// if partition value is less than kth position,
		// search right side of the array.
		else if (partition < k - 1)
			return kthSmallest(arr, partition + 1, high, k);

		// if partition value is more than kth position,
		// search left side of the array.
		else
			return kthSmallest(arr, low, partition - 1, k);
	}

	// Driver Code
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
			// find kth smallest value
			System.out.println(
				kPosition+"th smallest element in the array : "
				+ kthSmallest(arr, 0, n- 1,
							kPosition));
		}
	}
}
/*Time complexity:
  Best Case: O(N) => Eg: Finding the Kth smallest element within one sorting
                      => [1,3,5,4,3] After 1st Sorting [1,2,3,4,5] => we can find 3rd smallest with 1st sorting
  Worst Case: O(N^2) => If the array is already sorted in ascending order, then if we choose last element as pivot. 
                        We have to find the 1st smallest element, then we have to iterate N^2 times.
                        Eg: [1,2,3,4,5] => we have to do N^2 iterations to find 1st smallest element
*/
