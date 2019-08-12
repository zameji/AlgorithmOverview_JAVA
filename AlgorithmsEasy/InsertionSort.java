package AlgorithmsEasy;

public class InsertionSort {

    public static int[] sort(int[] arr) {

        int temp;
        for (int i = 1; i < arr.length; i++) {
            int left = i - 1;
            int cur = arr[i];
            while (arr[left] > cur && left > 0) {
                temp = arr[left];
                arr[left] = arr[left + 1];
                arr[left + 1] = temp;
                left--;
            }

        }

        return arr;
    }

}
