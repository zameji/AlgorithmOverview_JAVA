package AlgorithmsEasy;

/**
 * Find index at which a number should be inserted into an array
 *
 * @ param  arr sorted array to insert into
 * @ param  insert integer to insert
 * @ returns index to insert the number to keep formatting (would require pushing all numbers with a higher index)
 */
public class FindInsert {

    public static int find(int[] arr, int insert) {
        return find(arr, insert, 0, arr.length);
    }

    private static int find(int[] arr, int insert, int low, int high) {
        /* Details: Subarray must be contiguous
         * Problem:
         * Subarray may start anywhere in the array
         * A temporary decrease may lead to a later increase:
         *  e.g.: int[] arr = {5,-1,3}
         *      Step 1: 5 is max
         *      Step 2: 5 - 1 = 4 --> DECREASE
         *      Step 3: 4 + 3 = 7 --> INCREASE AND ACTUAL MAX
         * Solution: Patience?
         *      int[] arr = {5,-1,-1,3}
         *      Step 1: 5 is max;
         *      Step 2: 5-1 not max, but wait (> 0)
         *      Step 3: 4-1 not max, but wait (> 0)
         *      Step 4: 3+3 = 6 new max, new patience
         * Further steps: improve performance - currently O(n);
         * Ideas:
         *  Recursion:
         *      {5,-1,-2,1-1,3}
         *      5,-1 --> 4 : positive sum, can be added
         *      -2,1 --> -1: negative sum, cannot be added
         *      -1,3 --> 2 : positive sum, can be added
         *      Max of (4, 4-1, -1, -1+2, 2) --> 4*/
        if (high - low == 1) {
            if (arr[low] < insert) {
                return high;
            } else {
                return low;
            }
        }

        int median = (low + high) / 2;
        if (insert < arr[median]) {
            return find(arr, insert, low, median);
        } else if (insert > arr[median]) {
            return find(arr, insert, median, high);
        }
        // insert == median: insert before first occurrence
        else {
            while (insert == arr[median] && median > 0) {
                median--;
            }
            return median;
        }
    }

}
