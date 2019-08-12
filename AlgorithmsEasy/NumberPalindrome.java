package AlgorithmsEasy;

public class NumberPalindrome {

    public static boolean check(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) return false;

        return ReverseInt.reverse(num) == num;

    }

}
