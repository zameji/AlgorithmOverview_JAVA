package Tests;

import AlgorithmsEasy.FindInsert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindInsertTest {

    @Test
    public void find() {
        int COMPLEXITY = 10;
        int[][] testarr = new int[COMPLEXITY][COMPLEXITY - 1];
        int[] correct = new int[COMPLEXITY];
        int[] insert = new int[COMPLEXITY];

        for (int i = 0; i < testarr.length; i++) {
            for (int j = 0; j < COMPLEXITY; j++) {
                if (j < i) {
                    if (j > 0 && ((int) (Math.random() * 100) < 50)) {
                        testarr[i][j] = testarr[i][j - 1];
                    } else {
                        testarr[i][j] = j;
                    }
                }
                if (j > i) {
                    if (j > i + 1 && ((int) (Math.random() * 100) < 50)) {
                        testarr[i][j - 1] = testarr[i][j - 2];
                    } else {
                        testarr[i][j - 1] = j;
                    }
                }
                if (j == i) {
                    correct[i] = j;
                    insert[i] = j;
                }
            }
        }

        int[] results = new int[COMPLEXITY];
        for (int i = 0; i < COMPLEXITY; i++) {
            results[i] = FindInsert.find(testarr[i], insert[i]);
        }

        assertArrayEquals(results, correct);

    }
}