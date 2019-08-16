package AlgorithmsEasy;


public class addOne {

    /**
     * Increment a number represented as a list of digits
     *
     * @param num  the number to increment
     * @param base the number system (allows binary to decimal numbers)
     * @return the incremented number
     */
    public static int[] add(int[] num, int base) {
        final int BASE = base;

        int carry = 1;
        int i = num.length - 1;
        while (carry > 0 && i >= 0) {
            num[i] += carry;
            carry = num[i] / BASE;
            num[i] %= BASE;
            i--;
        }

        if (carry > 0) {
            int[] numLarger = new int[num.length + 1];
            System.arraycopy(num, 0, numLarger, 1, num.length);
            numLarger[0] = carry;
            return numLarger;
        } else return num;

    }

    public static int[] add(int[] num) {
        return add(num, 10);
    }

}
