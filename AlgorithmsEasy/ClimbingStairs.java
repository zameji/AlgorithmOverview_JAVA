package AlgorithmsEasy;


public class ClimbingStairs {
    /**
     * Finds the number of ways in which a staircase can be climbed in 1 and 2 step steps
     *
     * @param stairs the number of steps in staircase, must be >= 1
     * @return the number of ways
     */
    private static int climb(int stairs, int step) {

        //if we crossed the final step, return 1
        if (stairs == step) return 1;

        //if the current step would take us over the top, return 0
        if (stairs < step) return 0;

        // otherwise return the number of ways to finish the rest of the staircase if we take 1 step or 2 steps now
        return climb(stairs, step + 1) + climb(stairs, step + 2);
    }

    public static int climb(int stairs) {
        return climb(stairs, 0); // we always start at the first step
    }

}
