package AlgorithmsEasy;

/**
 * Checks if a number is a palindrome, i.e. same backwards as forwards (negation signs are kept in position, (i.e. -52 is compared to 25-), zeros are truncated)
 *
 * @ param num a number to be checked
 * @ returns whether the number is the same when reversed
 */
public class NumberPalindrome {

    public static boolean check(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) return false;

        return ReverseInt.reverse(num) == num;

    }

}
