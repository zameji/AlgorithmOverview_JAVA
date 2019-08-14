package Tests;

import AlgorithmsEasy.LinearSearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {

    @Test
    public void search() {
        int COMPLEXITY = 1000;

        int[] testarr = new int[COMPLEXITY];
        int rand = (int) (Math.random() * COMPLEXITY);

        //initialize
        for (int i = 0; i < testarr.length; i++) {
            testarr[i] = i;
        }
        assertEquals(LinearSearch.search(testarr, rand), rand);
    }
}