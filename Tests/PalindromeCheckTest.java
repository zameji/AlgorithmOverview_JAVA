package Tests;

import AlgorithmsEasy.PalindromeCheck;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PalindromeCheckTest {

    @Test
    public void check() {

        String[] teststring = {"motor", "rotor", "abba", "alba"};
        boolean[] correct = {false, true, true, false};
        boolean[] checked = new boolean[4];
        for (int i = 0; i < teststring.length; i++) {
            checked[i] = PalindromeCheck.check(teststring[i]);
        }
        assertArrayEquals(checked, correct);
    }
}