package AlgorithmsEasy;

//Sort an array using bubble sort
public class BubbleSort {

    public static int[] sort(int[] arr) {

        //keep track if swap occured + end of unsorted array
        boolean swapped;
        int boundary = arr.length - 1;

        // do-while to make sure at least one iteration
        do {
            swapped = false;
            for (int i = 0; i < boundary; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }

                //boundary doesn't seem to work; do we really need to look at the whole array every time?
                // boundary--;
            }
        } while (swapped);

        return arr;
    }


}