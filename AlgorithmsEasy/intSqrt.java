package AlgorithmsEasy;


public class intSqrt {
    /**
     * Calculates the highest integer whose square is still smaller or equal to n
     *
     * @param n the number to find square root for (required n > 0)
     * @return the largest number x that meets: x*x <= n
     */
    public static int calculate(int n) {
        if (n == 1) return 1;

        int low = 1; // by definition, we know that result must be >= 1 (since n>0)
        int high = n / 2; // a square root will never be larger than half of a number

        while (low < high) {
            int result = low + (high - low + 1) / 2; // first guess
            int guess = n / result;
            if (guess == result) return result;  // we have the right root
            else if (result > guess) high = result - 1;   // root too high, lower it
            else low = result;    // root too low, increase
        }

        return high;
    }

}
