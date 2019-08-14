package Tests;

import AlgorithmsMedium.Percolation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercolationTest {

    @Test
    public void simulate() {
        double threshold = Percolation.simulate(10);
        boolean correct = 0.55 < threshold && threshold < 0.65;
        System.out.println(threshold);
        assertEquals(correct, true);
    }
}