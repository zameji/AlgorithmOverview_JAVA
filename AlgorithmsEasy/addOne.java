package AlgorithmsEasy;

public class addOne {

    public static int[] add(int[] arr) {

        int carry = 1;
        int i = arr.length - 1;
        while (carry > 0 && i >= 0) {
            arr[i] += carry;
            carry = arr[i] / 10;
            arr[i] %= 10;
            i--;
        }

        if (carry > 0) {
            int[] arr_n = new int[arr.length + 1];
            System.arraycopy(arr, 0, arr_n, 1, arr.length);
            arr_n[0] = carry;
            return arr_n;
        } else return arr;


    }

}
