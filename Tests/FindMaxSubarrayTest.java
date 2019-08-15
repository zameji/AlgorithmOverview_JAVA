package Tests;

import AlgorithmsEasy.FindMaxSubarray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMaxSubarrayTest {

    @Test
    public void findSum() {

        int[] arr_0 = {7, 0, 3, -1, 1, -4, 3};
        int[] arr_1 = {-3, -2, 3, -5, 2, -2, 3, 2};
        int[] arr_2 = {3, -2, 2, 2};

        assertEquals(10, FindMaxSubarray.findSum(arr_0));
        assertEquals(5, FindMaxSubarray.findSum(arr_1));
        assertEquals(5, FindMaxSubarray.findSum(arr_2));
    }
}