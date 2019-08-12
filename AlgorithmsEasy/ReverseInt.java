package AlgorithmsEasy;

public class ReverseInt {

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
