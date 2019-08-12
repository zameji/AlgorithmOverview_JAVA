package Tests;

import AlgorithmsEasy.LongestCommonPrefix;
import AlgorithmsEasy.PalindromeCheck;
import AlgorithmsMedium.LongestUniqueSubstring;

import java.util.Arrays;

class StringTests {

    static void test() {
        System.out.println("___________\nSTINGTESTS");
        String[] teststring = {"motor", "rotor", "abba", "alba"};
        System.out.println("Testing...");
        System.out.print("\tPalindrome verification...");

        boolean[] correct = {false, true, true, false};
        boolean[] checked = new boolean[4];
        for (int i = 0; i < teststring.length; i++) {
            checked[i] = PalindromeCheck.check(teststring[i]);
        }
        if (Arrays.equals(checked, correct)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            System.out.println(Arrays.toString(checked));
        }

        System.out.print("\tLongest unique substring...");

        String testString = "abcabcajj";
        int target = 4;
        int result = LongestUniqueSubstring.find(testString);
        if (result == target) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            System.out.println("\t\t" + result + " instead of " + target);
        }

        System.out.print("\tLongest common prefix...");

        String[] testStrings = {"fling", "flung", "flick"};
        String prefix = "fl";
        String resultString = LongestCommonPrefix.get(testStrings);
        if (resultString.equals(prefix)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            System.out.println("\t\t" + resultString + " instead of " + prefix);
        }
    }

}
