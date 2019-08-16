package AlgorithmsEasy;

/**
 * Binary search of sorted arrays
 *
 * @ param arr a sorted array to be searched
 * @ param key an item to be found
 * @ returns    the index of the item or -1 if not found
 */
public class BinarySearch {

    public static int search(int[] arr, int key) {
        return search(arr, key, 0, arr.length);
    }

    private static int search(int[] arr, int key, int low, int high) {

        if (low > high) {
            return -1;
        }
        if (high - low == 1 && arr[low] == key) {
            return low;
        } else if (high - low == 1) {
            return high;
        }

        int median = (low + high) / 2;

        if (arr[median] == key) {
            return median;
        } else if (arr[median] < key) {
            return search(arr, key, median, high);
        } else {
            return search(arr, key, low, median);
        }

    }


}
