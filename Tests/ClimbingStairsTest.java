package Tests;

import AlgorithmsEasy.ClimbingStairs;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test the stairclimbing class
 * Values tested are:
 * 1 (smallest number of stairs)
 * 2 (smallest number with multiple options)
 * 3 (smallest number with distinct 1+2 versus 2+1 options)
 */
public class ClimbingStairsTest {

    @Test
    public void climb() {
        assertEquals(1, ClimbingStairs.climb(1));
        assertEquals(2, ClimbingStairs.climb(2));
        assertEquals(3, ClimbingStairs.climb(3));
    }
}