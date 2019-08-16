package Tests;

import AlgorithmsEasy.pascalsTriangle;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Tests Pascal's triangle against a hardcoded case
 */
public class pascalsTriangleTest {

    @Test
    public void create() {
        int[][] triangle = pascalsTriangle.create(7);
        assertArrayEquals(new int[]{1}, triangle[0]);
        assertArrayEquals(new int[]{1, 1}, triangle[1]);
        assertArrayEquals(new int[]{1, 2, 1}, triangle[2]);
        assertArrayEquals(new int[]{1, 3, 3, 1}, triangle[3]);
        assertArrayEquals(new int[]{1, 4, 6, 4, 1}, triangle[4]);
        assertArrayEquals(new int[]{1, 5, 10, 10, 5, 1}, triangle[5]);
        assertArrayEquals(new int[]{1, 6, 15, 20, 15, 6, 1}, triangle[6]);

    }

    @Test
    public void getRowK() {
        assertArrayEquals(new int[]{1}, pascalsTriangle.getRowK(0));
        assertArrayEquals(new int[]{1, 6, 15, 20, 15, 6, 1}, pascalsTriangle.getRowK(6));
        assertArrayEquals(new int[]{1, 3, 3, 1}, pascalsTriangle.getRowK(3));
    }
}