package Tests;

import AlgorithmsEasy.addBinary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class addBinaryTest {

    @Test
    public void add() {
        assertEquals(addBinary.add("11", "1"), "100");

    }
}