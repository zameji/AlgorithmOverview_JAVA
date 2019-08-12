package Tests;

import AlgorithmsEasy.BinarySearch;
import AlgorithmsEasy.LinearSearch;

import java.util.Scanner;

class SearchTests {

    static void test() {
        Scanner input = new Scanner(System.in);
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
