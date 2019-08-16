package AlgorithmsEasy;

/**
 * Implements the selection sort algorithm
 *
 * @ param arr a non-empty array of ints
 * @ param desc whether the order should be descending, default = false
 * @ returns the sorted array
 */
public class SelectionSort {

    public static int[] sort(int[] arr) {
        return sort(arr, false);
    }

    private static int[] sort(int[] arr, boolean desc) {

        if (desc) {
            int n = arr.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
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

            for (int i = 0; i < n - 1; i++) {
                int index = i;
                for (int j = i + 1; j < n; j++) {
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