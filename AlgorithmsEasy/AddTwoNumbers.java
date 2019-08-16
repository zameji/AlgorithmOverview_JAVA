package AlgorithmsEasy;

import java.util.LinkedList;


public class AddTwoNumbers {

    /**
     * Takes two numbers, represented by linked lists digit-by-digit (from the smallest decimal)
     * Sums them up, returns result as a LinkedList (backwards).
     *
     * @param first  the first number to add
     * @param second the second number to add
     * @param base   allows specifying the base (optional, bases <= 10 supported)
     * @return first+second
     */
//
    public static LinkedList<Integer> add(LinkedList first, LinkedList second, int base) {
        final int BASE = base;
        // We will go digit by digit, summing them up
        int carry = 0; //to carry over a decimal
        LinkedList<Integer> result = new LinkedList<>();

        //if there are still elements in list, get them, else get 0
        //then sum them up, find if there is anything to carry over
        while (first.size() > 0 || second.size() > 0) {
            int one = (first.size() > 0) ? (int) first.pop() : 0;
            int two = (second.size() > 0) ? (int) second.pop() : 0;
            int sum = one + two + carry;
            carry = sum / BASE;
            sum %= BASE;

            result.add(sum);
        }

        if (carry > 0) result.add(carry);

        return result;

    }

    public static LinkedList<Integer> add(LinkedList first, LinkedList second) {
        return add(first, second, 10);
    }
}
