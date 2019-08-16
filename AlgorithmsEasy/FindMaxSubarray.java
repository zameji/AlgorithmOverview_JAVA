package AlgorithmsEasy;


public class FindMaxSubarray {
    /**
     * Finds the subarray of an array that has the largest sum
     *
     * @param arr integer array with length > 0 in which the maximum sum should be found
     * @return the highest found contiguous sum
     */
    public static int findSum(int[] arr) {

        int max = Integer.MIN_VALUE; // Other initializations may fail if all elements in array negative, change to Integer.MIN_VALUE?
        int endHereMax = 0;
        int patience = 0;

        for (int val : arr) {
            if (endHereMax + val > endHereMax) {
                endHereMax += val;
                patience = endHereMax;
                if (endHereMax > max) max = endHereMax;
            } else if (patience + val > 0) {
                patience += val;
                endHereMax += val;
            } else {
                endHereMax = 0;
                patience = 0;
            }
        }

        return max;

    }

}
