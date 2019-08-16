package Tests;

import AlgorithmsMedium.Percolation;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PercolationTest {

    @Test
    public void simulate() {
        double threshold = Percolation.simulate(222);
        boolean correct = 0.56 < threshold && threshold < 0.63; //should be 0.593 in large data
        System.out.println(threshold);
        assertTrue(correct);
    }
}