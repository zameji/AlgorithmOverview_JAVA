package Tests;

import Algorithms.*;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    private static Scanner input = new Scanner(System.in);

    // Test individual algorithms one by one
    public static void main(String[] args) {
        sortTest();
        searchTest();
    }

    /* Tests all currently implemented sorting algorithms - a randomly organized array of 5000 items used for testing
    TO-DO: Have repeating elements in the test arrays
     */
    private static void sortTest() {
        System.out.println("___________\nSORTING");
        System.out.println("Setting up tests...");
        System.out.print("Choose test array size: ");
        int complexity = input.nextInt();

        int[] testarr = new int[complexity];
        int[] checkarr = new int[complexity];


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

        System.out.println("Testing...");
        System.out.print("\tBubble sort...");

        if (Arrays.equals(BubbleSort.sort(testarr), checkarr)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

        System.out.print("\tMerge sort...");
        if (Arrays.equals(MergeSort.sort(testarr), checkarr)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

        System.out.print("\tSelect sort...");
        if (Arrays.equals(SelectionSort.sort(testarr), checkarr)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }


    }

    private static void searchTest() {

        System.out.println("___________\nSEARCHING");
        System.out.println("Setting up tests...");
        System.out.print("Choose test array size: ");
        int complexity = input.nextInt();

        int[] testarr = new int[complexity];
        int rand = (int) (Math.random() * complexity);

        //initialize
        for (int i = 0; i < testarr.length; i++) {
            testarr[i] = i;
        }

        System.out.println("Testing...");
        System.out.print("\tLinear search...");

        if (LinearSearch.search(testarr, rand) == rand) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

        System.out.print("\tBinary search...");
        if (BinarySearch.search(testarr, rand) == rand) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

    }
}
