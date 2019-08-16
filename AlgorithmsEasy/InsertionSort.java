package AlgorithmsEasy;


public class InsertionSort {
    /**
     * Sorts an array using the insertion sort algorithm
     *
     * @param arr an array to sort
     * @return the sorted array in ascending order
     */
    public static int[] sort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            int left = i;
            while (left > 0 && arr[left - 1] > arr[left]) {
                temp = arr[left];
                arr[left] = arr[left - 1];
                arr[left - 1] = temp;
                left--;
            }

        }

        return arr;
    }

}
