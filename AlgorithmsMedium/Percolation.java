package AlgorithmsMedium;

/**
 * A percolation simulation framework
 *
 * @ param side the size of the simulation matrix (its side length)
 * @ returns an estimate of the percolation threshold
 */
public class Percolation {

    private static final int IMAGINARY_TOP_UNIT = 1;
    private static final int IMAGINARY_BOTTOM_UNIT = 1;
    private static int SIZE;
    private static int[] size = new int[SIZE * SIZE + IMAGINARY_TOP_UNIT + IMAGINARY_BOTTOM_UNIT];
    private static boolean[] open = new boolean[SIZE * SIZE + IMAGINARY_TOP_UNIT + IMAGINARY_BOTTOM_UNIT];
    private static int[] connected = new int[SIZE * SIZE + IMAGINARY_TOP_UNIT + IMAGINARY_BOTTOM_UNIT];

    private static void initialize(int side) {
        SIZE = side;

        size = new int[SIZE * SIZE + IMAGINARY_TOP_UNIT + IMAGINARY_BOTTOM_UNIT];
        open = new boolean[SIZE * SIZE + IMAGINARY_TOP_UNIT + IMAGINARY_BOTTOM_UNIT];
        connected = new int[SIZE * SIZE + IMAGINARY_TOP_UNIT + IMAGINARY_BOTTOM_UNIT];

        for (int i = 0; i < SIZE * SIZE; i++) {
            open[i] = false;
            connected[i] = i;
        }

        //open imaginary top & connect it to top layer
        open[SIZE * SIZE] = true;
        connected[SIZE * SIZE] = SIZE * SIZE;
        for (int i = 0; i < SIZE; i++) {
            connected[i] = SIZE * SIZE;
        }

        //open imaginary bottom
        open[SIZE * SIZE + IMAGINARY_BOTTOM_UNIT] = true;
        connected[SIZE * SIZE + IMAGINARY_BOTTOM_UNIT] = SIZE * SIZE + IMAGINARY_BOTTOM_UNIT;
        for (int i = SIZE * (SIZE - 1); i < SIZE * SIZE; i++) {
            connected[i] = (SIZE * SIZE) + IMAGINARY_BOTTOM_UNIT;
        }
    }

    private static double getThreshold() {
        double openSum = 0.0;
        for (int i = 0; i < SIZE * SIZE; i++) {
            if (open[i]) openSum++;
        }
        return (openSum) / (double) (SIZE * SIZE);
    }

    public static double simulate() {
        return simulate(10);
    }

    public static double simulate(int side) {
        initialize(side);
        boolean percolates = false;

        while (!percolates) {
            openRandom();
            percolates = flows();
        }
        //report();
        return getThreshold();
    }

    private static void openRandom() {
        int rand = (int) (Math.random() * SIZE * SIZE);
        if (!open[rand]) {
            open[rand] = true;
            connectOpen(rand);
        }
    }

    private static void connectOpen(int id) {
        //System.out.println(id);
        //unit can be in: middle/left side/right side/top row/bottom row
        //System.out.print(id);
        if (id % SIZE == 0) {

            if (id == 0) {
                //System.out.println("//left top corner");
                connect(id, id + 1);
                connect(id, id + SIZE);
            } else if (id == (SIZE * (SIZE - 1))) {
                //System.out.println("//left bottom corner");
                connect(id, id + 1);
                connect(id, id - SIZE);
            } else {
                //System.out.println("//left side");
                connect(id, id + 1);
                connect(id, id + SIZE);
                connect(id, id - SIZE);
            }

        } else if (id % SIZE == SIZE - 1) {

            if (id == SIZE - 1) {
                //System.out.println("//right top corner");
                connect(id, id - 1);
                connect(id, id + SIZE);

            } else if (id == SIZE * SIZE - 1) {
                //System.out.println("//right bottom corner");
                connect(id, id - 1);
                connect(id, id - SIZE);
            } else {
                //System.out.println("//right side");
                connect(id, id - 1);
                connect(id, id + SIZE);
                connect(id, id - SIZE);
            }

        } else if (id < SIZE) {
            //System.out.println("//top row");
            connect(id, id + 1);
            connect(id, id - 1);
            connect(id, id + SIZE);
        } else if (id >= SIZE * (SIZE - 1)) {
            //System.out.println("//bottom row");
            connect(id, id + 1);
            connect(id, id - 1);
            connect(id, id - SIZE);
        } else {
            //System.out.println("//middle");
            connect(id, id + 1);
            connect(id, id - 1);
            connect(id, id + SIZE);
            connect(id, id - SIZE);
        }
    }

    private static void connect(int id_i, int id_j) {
        if (!open[id_i]) return;
        if (!open[id_j]) return;
        //System.out.println("\t" + id_i + ":" + open[id_i] + " + " + id_j + ":" + open[id_j]);

        int i = root(id_i);
        int j = root(id_j);

        if (i == j) return;

        if (size[i] < size[j]) {
            connected[i] = j;
            size[j] += size[i];
        } else {
            connected[j] = i;
            size[i] += size[j];
        }

    }

    private static int root(int id) {
        //System.out.println("Searching root of: " + id);
        while (id != connected[id]) {
            connected[id] = connected[connected[id]];
            id = connected[id];
            //System.out.println(id);
        }

        return id;
    }

    private static boolean flows() {
        return root(SIZE * SIZE) == root(SIZE * SIZE + 1);
    }

    private static void report() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print((open[i * SIZE + j]) ? ' ' : '▮');
            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(connected));
        //System.out.println(Arrays.toString(open));
    }
}
