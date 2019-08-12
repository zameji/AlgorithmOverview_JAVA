package AlgorithmsEasy;

//most primitive of searches, works even with unsorted arrays. Speed purely in O(N).
public class LinearSearch{

	public static int search(int[] arr, int key){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key){return i;}
		}
		return -1;

	}


}
