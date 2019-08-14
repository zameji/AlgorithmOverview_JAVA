package Tests;

import AlgorithmsEasy.RomanToInt;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RomanToIntTest {

    @Test
    public void convert() {

        String[] testarr = new String[]{"MCM", "MDCCCXLVIV", "MCMXCI"};
        int[] checkarr = new int[]{1900, 1849, 1991};

        int[] result = new int[testarr.length];
        for (int i = 0; i < testarr.length; i++) {
            result[i] = RomanToInt.convert(testarr[i]);
        }

        assertArrayEquals(checkarr, result);
    }
}