package AlgorithmsEasy;


public class FindInsert {

    public static int find(int[] arr, int insert) {
        return find(arr, insert, 0, arr.length);
    }

    private static int find(int[] arr, int insert, int low, int high) {

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
