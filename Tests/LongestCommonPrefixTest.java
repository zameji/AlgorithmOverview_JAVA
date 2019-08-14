package Tests;

import AlgorithmsEasy.LongestCommonPrefix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void get() {
        String[] testStrings = {"fling", "flung", "flick"};
        String prefix = "fl";
        String resultString = LongestCommonPrefix.get(testStrings);
        assertEquals(resultString, prefix);
    }
}