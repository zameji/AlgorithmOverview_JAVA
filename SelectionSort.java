//Implements the selection sort algorithm. This works in O(N^2) time to sort an array in ascending order.
public class SelectionSort{

	public static int[] sort(int[] arr){
		return sort(arr, false);		
	}

	public static int[] sort(int[] arr, boolean desc){


    if (desc){ 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } else {
 
		int n = arr.length;
		
		for (int i=0; i < n-1; i++){
			int index = i;
			for (int j = i+1; j < n; j++){
				if (arr[j] < arr[index])
					index = j;									
			}
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
			
		}
		
	}
		return arr;
	}
}