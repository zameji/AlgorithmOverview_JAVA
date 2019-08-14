package Tests;

import AlgorithmsEasy.FindSubstring;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindSubstringTest {

    @Test
    public void find() {
        String[] testStrings = {"hello", "world", "how owls eat", "rowdies"};
        String[] subStrings = {"ll", "", "ow", "cow"};
        int[] result = new int[4];
        int[] correct = {2, 0, 1, -1};

        for (int i = 0; i < testStrings.length; i++) {
            result[i] = FindSubstring.find(testStrings[i], subStrings[i]);
        }

        assertArrayEquals(result, correct);

    }
}