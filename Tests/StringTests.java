package Tests;

import AlgorithmsEasy.LongestCommonPrefix;
import AlgorithmsEasy.PalindromeCheck;
import AlgorithmsEasy.ValidateBrackets;
import AlgorithmsMedium.LongestUniqueSubstring;

import java.util.Arrays;

class StringTests {

    static void test() {
        System.out.println("___________\nSTINGTESTS");
        System.out.println("Testing...");
        palindromeTest();
        longestUniqueSubstringTest();
        longestCommonPrefixTest();
        validateBracketsTest();
    }

    private static void palindromeTest() {
        System.out.print("\tPalindrome verification...");
        String[] teststring = {"motor", "rotor", "abba", "alba"};
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

    }

    private static void longestUniqueSubstringTest() {
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
    }

    private static void longestCommonPrefixTest() {

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

    private static void validateBracketsTest() {
        System.out.print("\tValidate brackets...");

        String[] testStrings = new String[]{"())", "([{[()]}])", "(([)])"};
        boolean[] correct = new boolean[]{false, true, false};
        boolean[] check = new boolean[3];
        for (int i = 0; i < correct.length; i++) {
            check[i] = ValidateBrackets.validate(testStrings[i]);
        }

        if (Arrays.equals(check, correct)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            for (int i = 0; i < correct.length; i++) {
                System.out.println("\t\t" + testStrings[i] + "-->" + check[i] + " instead of " + correct[i]);
            }
        }

    }

}
