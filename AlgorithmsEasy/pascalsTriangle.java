package AlgorithmsEasy;


public class pascalsTriangle {

    private static int[][] cache = new int[1000][]; //cache the calculated rows
    private static boolean[] cached = new boolean[1000];

    /**
     * Creates Pascal's triangle
     *
     * @param rows number of rows in the triangle
     * @return the triangle represented by array of arrays
     */
    public static int[][] create(int rows) {
        //create the empty rows
        int[][] triangle = new int[rows][];

        //create first row
        triangle[0] = new int[]{1};

        for (int i = 1; i < rows; i++) {
            triangle[i] = getNextRow(triangle[i - 1]);
        }

        return triangle;

    }

    /**
     * Gets k-th row of Pascal's triangle
     *
     * @param k index (0 indexed) of desired row in the triangle
     * @return the k-th row
     */
    public static int[] getRowK(int k) {
        if (cached[k]) return cache[k];

        //get the last cached row
        int startpoint = 0;
        for (int i = k; i > 0; i--) {
            if (cached[i]) {
                startpoint = i;
                break;
            }
        }

        //from last cached get to the result
        int[] current;
        if (startpoint == 0) current = new int[]{1};
        else current = cache[startpoint];

        while (startpoint < k) {
            current = getNextRow(current);
            startpoint++;

            //cache the result
            cache[startpoint] = current;
            cached[startpoint] = true;
        }

        return current;

    }

    /**
     * Gets the next row of Pascal's triangle
     *
     * @param current a valid row
     * @return the following row
     */
    private static int[] getNextRow(int[] current) {
        int[] next = new int[current.length + 1];
        for (int j = 0; j <= current.length; j++) {
            int left = (j == 0) ? 0 : current[j - 1];
            int right = (j == current.length) ? 0 : current[j];
            next[j] = left + right;
        }

        return next;

    }

}
