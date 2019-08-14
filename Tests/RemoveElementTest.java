package Tests;

import AlgorithmsEasy.RemoveElement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {

    @Test
    public void remove() {
        int[] testarr = new int[1000];
        for (int i = 0; i < testarr.length; i++) {
            testarr[i] = (int) (Math.random() * 1000);
        }

        for (int i = 0; i < 20; i++) {
            testarr[i * 40] = 1001;
        }

        int result = RemoveElement.remove(testarr, 1001);
        assertEquals(980, result);
    }
}