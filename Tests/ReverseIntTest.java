package Tests;

import AlgorithmsEasy.ReverseInt;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseIntTest {

    @Test
    public void reverse() {
        int[] testarr = new int[]{0, -321, 44, -14};
        int[] checkarr = new int[]{0, -123, 44, -41};
        int[] result = new int[testarr.length];

        for (int i = 0; i < testarr.length; i++) {
            result[i] = ReverseInt.reverse(testarr[i]);
        }

        assertArrayEquals(checkarr, result);
    }
}