package AlgorithmsEasy;


public class RemoveDuplicatesFromSortedArray {
    /**
     * Removes duplicates from a sorted array
     *
     * @param arr a sorted array (possibly with duplicates)
     * @return length of array without duplicates
     */
    public static int getLength(int[] arr) {

        int end = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                end++;
            }
        }
        return end;

    }

}
