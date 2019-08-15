package AlgorithmsEasy;

/*
Task: Find the subarray of an array that has the largest sum
Details: Subarray must be contiguous
Problem:
    Subarray may start anywhere in the array
    A temporary decrease may lead to a later increase:
        e.g.: int[] arr = {5,-1,3}
        Step 1: 5 is max
        Step 2: 5 - 1 = 4 --> DECREASE
        Step 3: 4 + 3 = 7 --> INCREASE AND ACTUAL MAX
Solution: Patience?
        int[] arr = {5,-1,-1,3}
        Step 1: 5 is max;
        Step 2: 5-1 not max, but wait (> 0)
        Step 3: 4-1 not max, but wait (> 0)
        Step 4: 3+3 = 6 new max, new patience
Further steps: improve performance - currently O(n);
Ideas:
    Recursion:
    {5,-1,-2,1-1,3}
    5,-1 --> 4 : positive sum, can be added
    -2,1 --> -1: negative sum, cannot be added
    -1,3 --> 2 : positive sum, can be added
    Max of (4, 4-1, -1, -1+2, 2) --> 4
 */
public class FindMaxSubarray {

    public static int findSum(int[] arr) {

        int max = 0;
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
