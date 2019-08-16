package AlgorithmsEasy;

/**
 * Prepares the removal of an element in place
 *
 * @ param arr an array
 * @ param del the integer to remove from the array
 * @ returns length of array without the given element, moves the element to the end of the array
 */
public class RemoveElement {

    public static int remove(int[] arr, int del) {
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == del) {
                len--;
                arr[i] = arr[len - 1];
            } else {
                i++;
            }
        }

        return len;
    }

}
