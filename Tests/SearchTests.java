package Tests;

import AlgorithmsEasy.BinarySearch;
import AlgorithmsEasy.LinearSearch;

import java.util.Scanner;

class SearchTests {
    private static Scanner input = new Scanner(System.in);
    private static int[] testarr;
    private static int rand;

    static void test() {
        System.out.println("___________\nSEARCHING");
        System.out.println("Setting up tests...");
        System.out.print("Choose test array size: ");
        int complexity = input.nextInt();
        initialize(complexity);
        linearSearchTest();
        binarySearchTest();
    }

    private static void initialize(int complexity) {
        testarr = new int[complexity];
        rand = (int) (Math.random() * complexity);

        //initialize
        for (int i = 0; i < testarr.length; i++) {
            testarr[i] = i;
        }

    }

    private static void linearSearchTest() {
        System.out.println("Testing...");
        System.out.print("\tLinear search...");

        if (LinearSearch.search(testarr, rand) == rand) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }

    private static void binarySearchTest() {
        System.out.print("\tBinary search...");
        if (BinarySearch.search(testarr, rand) == rand) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

    }


}
