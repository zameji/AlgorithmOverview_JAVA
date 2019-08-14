package Tests;

import AlgorithmsMedium.LongestUniqueSubstring;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestUniqueSubstringTest {

    @Test
    public void find() {
        String testString = "abcabcajj";
        int target = 4;
        int result = LongestUniqueSubstring.find(testString);
        assertEquals(result, target);
    }
}