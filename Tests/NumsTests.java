package Tests;

import AlgorithmsEasy.*;

import java.util.LinkedList;
import java.util.Scanner;

class NumsTests {

    static void test() {
        Scanner input = new Scanner(System.in);
        System.out.println("___________\nNUMERIC TESTS");
        System.out.print("Choose test array size: ");
        int complexity = input.nextInt();

        //fill testarr, make sure unique solution exists
        int[] testarr = new int[complexity];
        int target = (int) (Math.random() * complexity * 100);
        testarr[0] = (int) (Math.random() * complexity * 100);
        testarr[1] = target - testarr[0];

        for (int i = 2; i < testarr.length; i++) {
            boolean found = false;
            while (!found) {
                boolean good = true;
                int rnd = (int) (Math.random() * complexity * 100);
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

        System.out.print("\tTwo sum...");
        try {
            int[] twoSumResult = TwoSum.getResult(testarr, target);
            if (twoSumResult[0] + twoSumResult[1] == target) {
                System.out.println("OK");
                System.out.println("\t\t" + twoSumResult[0] + "+" + twoSumResult[1] + "=" + target);
            } else {
                System.out.println("ERROR");
                System.out.println("\t\t" + twoSumResult[0] + "+" + twoSumResult[1] + "=/=" + target);
            }
        } catch (Exception e) {
            System.out.println("ERROR: Array probably poorly initialized");
        }

        System.out.print("\tReverse integer ...");
        testarr = new int[]{0, -321, 44, -14};
        int[] checkarr = new int[]{0, -123, 44, -41};

        boolean correct = true;
        for (int i = 0; i < testarr.length; i++) {
            if (ReverseInt.reverse(testarr[i]) != checkarr[i]) {
                correct = false;
                break;
            }
        }

        if (correct) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            for (int i = 0; i < testarr.length; i++) {
                System.out.println("\t\t" + testarr[i] + "-->" + ReverseInt.reverse(testarr[i]) + " instead of " + checkarr[i]);
            }
        }

        System.out.print("\tNumber palindrome ...");
        testarr = new int[]{0, -321, 40, 414, 444, 4};
        boolean[] checkarrBoolean = new boolean[]{true, false, false, true, true, true};

        correct = true;
        for (int i = 0; i < testarr.length; i++) {
            if (NumberPalindrome.check(testarr[i]) != checkarrBoolean[i]) {
                correct = false;
                break;
            }
        }

        if (correct) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            for (int i = 0; i < testarr.length; i++) {
                System.out.println("\t\t" + testarr[i] + "-->" + NumberPalindrome.check(testarr[i]) + " instead of " + checkarr[i]);
            }
        }

        System.out.print("\tRoman to int ...");
        String[] testarrRoman = new String[]{"MCM", "MDCCCXLVIV", "MCMXCI"};
        checkarr = new int[]{1900, 1849, 1991};

        correct = true;
        for (int i = 0; i < testarrRoman.length; i++) {
            if (RomanToInt.convert(testarrRoman[i]) != checkarr[i]) {
                correct = false;
                break;
            }
        }

        if (correct) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            for (int i = 0; i < testarrRoman.length; i++) {
                System.out.println("\t\t" + testarr[i] + "-->" + RomanToInt.convert(testarrRoman[i]) + " instead of " + checkarr[i]);
            }
        }

        System.out.print("\tAdd two linked lists ...");
        //Initialize
        String oneLL = Integer.toString((int) (Math.random() * 1000000));
        String twoLL = Integer.toString((int) (Math.random() * 1000000));
        int sumLL = Integer.parseInt(oneLL) + Integer.parseInt(twoLL);

        LinkedList<Integer> oneLLList = new LinkedList<>();
        LinkedList<Integer> twoLLList = new LinkedList<>();

        for (int i = oneLL.length() - 1; i >= 0; i--) {
            oneLLList.add(Character.getNumericValue(oneLL.charAt(i)));
        }

        for (int i = twoLL.length() - 1; i >= 0; i--) {
            twoLLList.add(Character.getNumericValue((twoLL.charAt(i))));
        }

        LinkedList<Integer> resultLLLinkedList = AddTwoNumbers.add(oneLLList, twoLLList);
        StringBuilder resultLLStringBuilder = new StringBuilder();
        while (resultLLLinkedList.size() > 0) {
            resultLLStringBuilder.append(Character.forDigit(resultLLLinkedList.pop(), 10));
        }

        int resultLLInt = Integer.parseInt(resultLLStringBuilder.reverse().toString());

        if (sumLL == resultLLInt) {
            System.out.println("OK");
            System.out.println("\t\t" + oneLL + "+" + twoLL + "=" + sumLL);
        } else {
            System.out.println("ERROR");
            System.out.println("\t\t" + oneLL + "+" + twoLL + "=/=" + resultLLInt + " CORRECT: " + sumLL);
        }

    }


}
