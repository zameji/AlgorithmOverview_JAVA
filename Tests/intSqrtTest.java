package Tests;

import AlgorithmsEasy.intSqrt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test the intSqrt class
 * The test checks the following values:
 * 1 (as the minimum allowed value)
 * 2 (as a value that requires rounding down)
 * 64 (as an ever number)
 * 81 (as an odd number)
 * 1000000 (as a large value)
 */
public class intSqrtTest {

    @Test
    public void calculate() {
        assertEquals(1, intSqrt.calculate(1));
        assertEquals(1, intSqrt.calculate(2));
        assertEquals(8, intSqrt.calculate(64));
        assertEquals(9, intSqrt.calculate(81));
        assertEquals(1000, intSqrt.calculate(1000000));
    }
}