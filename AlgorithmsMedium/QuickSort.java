package AlgorithmsMedium;

public class QuickSort {

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = divide(arr, left, right);

            sort(arr, left, partitionIndex - 1);
            sort(arr, partitionIndex + 1, right);
        }

    }

    private static int divide(int[] arr, int left, int right) {
        int partitionIndex = left;
        int pivot = arr[right];

        for (int j = partitionIndex; j < right; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[j];
                arr[partitionIndex] = arr[j];
                arr[j] = temp;
                partitionIndex++;
            }
        }

        int temp = arr[partitionIndex];
        arr[partitionIndex] = arr[right];
        arr[right] = temp;

        return partitionIndex;
    }

}
