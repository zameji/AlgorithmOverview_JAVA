import java.lang.Math;
import java.util.Arrays;

// Creates the algorithm testing program.
public class AlgoTester{

	private static int[] arr;
	private static boolean debug;
	
	public static void main(String[] args){
		debug = false;
		
		int len = (args.length > 0)? Integer.parseInt(args[0]) : 10;
		
		randomize(len);
		report();
		
		//sort the array: Selection sort
		long start = System.currentTimeMillis();
		arr = SelectionSort.sort(arr);
		System.out.println("Sorting took: " + (System.currentTimeMillis() - start) + "ms");
		report();
		
		System.out.println();
		
		randomize(len);
		report();		
		start = System.currentTimeMillis();
		arr = BubbleSort.sort(arr);
		System.out.println("Sorting took: " + (System.currentTimeMillis() - start) + "ms");
		report();
		
		System.out.println();
		//Search for a random int
		int rand = (int) (Math.random() * len);
		int index = LinearSearch.search(arr, rand);
		String result = (index > -1) ? "Found " + rand + " at index " + index : "Did not find " + rand;
		System.out.println(result);
	}
	
	private static void report(){
		if (debug) System.out.println(Arrays.toString(arr));
	}
	
	private static void randomize(int len){
		//initial random array
		arr = new int[len];
		
		for (int i=0; i < len; i++){
			arr[i] = (int) (Math.random() * len);
		}		
		
		
	}
	
}