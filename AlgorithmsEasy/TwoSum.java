package AlgorithmsEasy;

import java.util.HashMap;


public class TwoSum {


    /**
     * Given and array and a target, find two values in the array that produce the desired sum and return them
     *
     * @param arr    an array of numbers which contains exactly one pair that will produce a desired sum
     * @param target the desired sum of two elements
     * @return two elements that produce the desired sum
     */
    public static int[] getResult(int[] arr, int target) {
        // We are using a HashMap to keep track of the values that we tried. The advantage of storing
        // them in HashMap is that we have constant time access due to the hashing
        HashMap<Integer, Boolean> vals = new HashMap<>(arr.length);
        int[] result = new int[2];
        for (int val : arr) {
            if (vals.containsKey(target - val)) {
                result[0] = val;
                result[1] = target - val;
                return result;
            } else {
                vals.put(val, true);
            }

        }

        return result;

    }
}
