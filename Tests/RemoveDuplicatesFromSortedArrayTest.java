package Tests;

import AlgorithmsEasy.RemoveDuplicatesFromSortedArray;
import AlgorithmsMedium.MergeSort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void getLength() {
        int[] testarr = new int[1000];
        for (int i = 0; i < testarr.length - 100; i++) {
            testarr[i] = i;
        }

        for (int i = 900; i < testarr.length; i++) {
            testarr[i] = testarr[(i - 900) * 2];
        }

        testarr = MergeSort.sort(testarr);
        assertEquals(900, RemoveDuplicatesFromSortedArray.getLength(testarr));

    }
}