package Tests;

import AlgorithmsEasy.BubbleSort;
import AlgorithmsEasy.InsertionSort;
import AlgorithmsEasy.SelectionSort;
import AlgorithmsMedium.MergeSort;
import AlgorithmsMedium.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

class SortTests {
    private static Scanner input = new Scanner(System.in);
    private static int[] testarr;
    private static int[] checkarr;

    static void test() {
        System.out.println("___________\nSORTING");
        System.out.println("Setting up tests...");
        System.out.print("Choose test array size: ");
        int complexity = input.nextInt();
        initialize(complexity);
        System.out.println("Testing...");
        BubbleSortTest();
        InsertionSortTest();
        MergeSortTest();
        SelectSortTest();
        QuickSortTest(); // quick sort is in place, so it has to be last

    }

    private static void initialize(int complexity) {

        testarr = new int[complexity];
        checkarr = new int[complexity];

        //initialize
        for (int i = 0; i < testarr.length; i++) {
            testarr[i] = i;
            checkarr[i] = i;
        }

        //randomize testarr
        for (int i = 0; i < 10000; i++) {
            int rand1 = (int) (Math.random() * testarr.length);
            int rand2 = (int) (Math.random() * testarr.length);
            int buff = testarr[rand1];
            testarr[rand1] = testarr[rand2];
            testarr[rand2] = buff;
        }
    }

    private static void BubbleSortTest() {
        System.out.print("\tBubble sort...");

        if (Arrays.equals(BubbleSort.sort(testarr), checkarr)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }

    private static void InsertionSortTest() {
        System.out.print("\tInsertion sort...");
        if (Arrays.equals(InsertionSort.sort(testarr), checkarr)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }

    private static void MergeSortTest() {
        System.out.print("\tMerge sort...");
        if (Arrays.equals(MergeSort.sort(testarr), checkarr)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

    }

    private static void SelectSortTest() {
        System.out.print("\tSelect sort...");
        if (Arrays.equals(SelectionSort.sort(testarr), checkarr)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

    }

    private static void QuickSortTest() {
        System.out.print("\tQuick sort...");
        QuickSort.sort(testarr);
        if (Arrays.equals(testarr, checkarr)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

    }


}
