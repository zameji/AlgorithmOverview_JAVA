package AlgorithmsMedium;

import java.util.Arrays;


public class MergeSort {
    /**
     * Sorting by the merge sort algorithm (fast)
     *
     * @param arr an array of integers
     * @return the sorted array
     */
    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        } else {

            //Divide into chunk
            int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
            int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

            // Sort each chunk
            left = sort(left);
            right = sort(right);

            return merge(left, right);

        }
    }

    private static int[] merge(int[] left, int[] right) {

        int[] merged = new int[left.length + right.length];

        int index = 0;
        int pointer_left = 0;
        int pointer_right = 0;
        while (left[pointer_left] < right[0]) {
            merged[index] = left[pointer_left];
            index++;
            pointer_left++;

            if (pointer_left >= left.length) {
                break;
            }
        }

        while (index < merged.length) {
            if (pointer_left < left.length && pointer_right < right.length) {
                if (right[pointer_right] < left[pointer_left]) {
                    merged[index] = right[pointer_right];
                    pointer_right++;
                } else {
                    merged[index] = left[pointer_left];
                    pointer_left++;
                }
            } else if (pointer_left < left.length) {
                merged[index] = left[pointer_left];
                pointer_left++;
            } else {
                merged[index] = right[pointer_right];
                pointer_right++;
            }
            index++;
        }

        return merged;
    }
}
