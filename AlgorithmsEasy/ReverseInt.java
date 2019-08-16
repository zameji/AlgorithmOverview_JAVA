package AlgorithmsEasy;


public class ReverseInt {
    /**
     * Returns an integer read backwards
     *
     * @param i integer with base 10
     * @return the integer read backwards, negation sign stays in place (-25 is returned as -52)
     */
    public static int reverse(int i) {
        long result = 0;

        while (i != 0) {
            result = result * 10 + i % 10;
            i /= 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) result = 0;

        return (int) result;

    }

}
