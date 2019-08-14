package Tests;

import AlgorithmsEasy.NumberPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumberPalindromeTest {

    @Test
    public void check() {
        int[] testarr = new int[]{0, -321, 40, 414, 444, 4};
        boolean[] checkarr = new boolean[]{true, false, false, true, true, true};
        boolean[] result = new boolean[testarr.length];

        for (int i = 0; i < testarr.length; i++) {
            result[i] = NumberPalindrome.check(testarr[i]);
        }

        assertArrayEquals(checkarr, result);
    }
}