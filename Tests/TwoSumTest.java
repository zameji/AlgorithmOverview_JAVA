package Tests;

import AlgorithmsEasy.TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void getResult() {
        int COMPLEXITY = 1000;

        //fill testarr, make sure unique solution exists
        int[] testarr = new int[COMPLEXITY];
        int target = (int) (Math.random() * COMPLEXITY * 100);
        testarr[0] = (int) (Math.random() * COMPLEXITY * 100);
        testarr[1] = target - testarr[0];

        for (int i = 2; i < testarr.length; i++) {
            boolean found = false;
            while (!found) {
                boolean good = true;
                int rnd = (int) (Math.random() * COMPLEXITY * 100);
                for (int j = 0; j < i; j++) {
                    if (testarr[j] == target - rnd) {
                        good = false;
                        break;
                    }
                }
                if (good & rnd != target) testarr[i] = rnd;
                found = true;
            }
        }

        int[] twoSumResult = TwoSum.getResult(testarr, target);
        assertEquals(target, twoSumResult[0] + twoSumResult[1]);
    }
}