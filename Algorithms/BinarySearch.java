package Algorithms;

//Binary search of sorted arrays, repeatedly dividing the array into halfs
public class BinarySearch {

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

    public static int search(int[] arr, int key) {
        return search(arr, key, 0, arr.length);
    }

}
