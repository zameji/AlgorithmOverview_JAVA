package AlgorithmsMedium;

/**
 * Find the median of two sorted arrays
 *
 * @ param A a non-empty sorted array
 * @ param B a different non-empty sorted array
 * @ returns the median value of the two arrays combined*
 */
public class MedianOfTwoSortedArrays {

    public static double find(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        //make sure that m >= n
        if (m < n) {
            int[] temp = A;
            A = B;
            B = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }

        int indexMin = 0;
        int indexMax = m;
        int half = (m + n + 1) / 2;

        while (indexMin <= indexMax) {
            int i = (indexMin + indexMax) / 2;
            int j = half - i;

            if (i < indexMax && B[j - 1] > A[i]) {
                indexMin = i + 1;
            } else if (i > indexMin && A[i - 1] > B[j]) {
                indexMax = i - 1;
            } else {
                int maxLeft;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }
                if ((m + n) % 2 == 1) return maxLeft;

                int minRight;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(B[j], A[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }

        }

        return 0.0;
    }

}
