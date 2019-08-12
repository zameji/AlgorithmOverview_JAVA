package AlgorithmsEasy;

import java.util.LinkedList;

//Take two numbers, represented by linked lists digit-by-digit (from the smallest decimal)
//Sum them up, return result as a LinkedList (backwards)
public class AddTwoNumbers {
    public static LinkedList<Integer> add(LinkedList first, LinkedList second) {

        // We will go digit by digit, summing them up
        int carry = 0; //to carry over a decimal
        LinkedList<Integer> result = new LinkedList<>();

        //if there are still elements in list, get them, else get 0
        //then sum them up, find if there is anything to carry over
        while (first.size() > 0 || second.size() > 0) {
            int one = (first.size() > 0) ? (int) first.pop() : 0;
            int two = (second.size() > 0) ? (int) second.pop() : 0;
            int sum = one + two + carry;
            carry = sum / 10;
            sum %= 10;

            result.add(sum);
        }

        if (carry > 0) result.add(carry);

        return result;

    }

}
