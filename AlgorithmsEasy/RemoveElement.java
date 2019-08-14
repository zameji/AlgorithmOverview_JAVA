package AlgorithmsEasy;

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
