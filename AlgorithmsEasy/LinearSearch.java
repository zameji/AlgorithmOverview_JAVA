package AlgorithmsEasy;

/**
 * Finds an item in an array.
 *
 * @ param arr an array of integers
 * @ param key an item to be found
 * @ returns the index where the key was; if not found returns -1
 */
public class LinearSearch {

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }


}
