package Tests;

import AlgorithmsEasy.InsertionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void sort() {
        int COMPLEXITY = 10;
        int[] testarr = new int[COMPLEXITY];
        int[] checkarr = new int[COMPLEXITY];

        //initialize
        for (int i = 0; i < testarr.length; i++) {
            testarr[i] = i;
            checkarr[i] = i;
        }

        //randomize testarr
        for (int i = 0; i < 10000; i++) {
            int rand1 = (int) (Math.random() * testarr.length);
            int rand2 = (int) (Math.random() * testarr.length);
            int buff = testarr[rand1];
            testarr[rand1] = testarr[rand2];
            testarr[rand2] = buff;
        }

        assertArrayEquals(InsertionSort.sort(testarr), checkarr);

    }
}