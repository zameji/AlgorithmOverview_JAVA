package Tests;

import AlgorithmsEasy.addOne;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class addOneTest {

    @Test
    public void add() {
        int[] testarr = {1, 9, 9};
        int[] checkarr = {2, 0, 0};
        assertArrayEquals(checkarr, addOne.add(testarr));

        testarr = new int[]{9, 9, 9};
        checkarr = new int[]{1, 0, 0, 0};
        assertArrayEquals(checkarr, addOne.add(testarr));

        testarr = new int[]{1, 2, 3};
        checkarr = new int[]{1, 2, 4};
        assertArrayEquals(checkarr, addOne.add(testarr));
    }
}