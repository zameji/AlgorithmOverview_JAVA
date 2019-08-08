public class BubbleSort{

	public static int[] sort(int[] arr){
		
		boolean swapped;
		int boundary = arr.length-1;
		
		do {
			swapped = false;
			for (int i=0; i < boundary; i++){
				if (arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapped = true;	
				}
				
				// boundary--;
			}
		} while (swapped == true);

		return arr;
	}


}