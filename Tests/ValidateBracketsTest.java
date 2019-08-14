package Tests;

import AlgorithmsEasy.ValidateBrackets;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ValidateBracketsTest {

    @Test
    public void validate() {
        String[] testStrings = new String[]{"())", "([{[()]}])", "(([)])"};
        boolean[] correct = new boolean[]{false, true, false};
        boolean[] check = new boolean[3];
        for (int i = 0; i < correct.length; i++) {
            check[i] = ValidateBrackets.validate(testStrings[i]);
        }

        assertArrayEquals(check, correct);

    }
}