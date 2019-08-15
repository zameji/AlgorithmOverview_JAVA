package Tests;

import AlgorithmsEasy.LastWordLength;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastWordLengthTest {

    @Test
    public void find() {
        assertEquals(5, LastWordLength.find("Hello World"));
    }
}