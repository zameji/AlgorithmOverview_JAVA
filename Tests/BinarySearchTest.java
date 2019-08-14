package Tests;

import AlgorithmsEasy.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void search() {
        int COMPLEXITY = 1000;

        int[] testarr = new int[COMPLEXITY];
        int rand = (int) (Math.random() * COMPLEXITY);

        //initialize
        for (int i = 0; i < testarr.length; i++) {
            testarr[i] = i;
        }
        assertEquals(BinarySearch.search(testarr, rand), rand);

    }
}