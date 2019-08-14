package Tests;

import AlgorithmsEasy.AddTwoNumbers;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

    @Test
    public void add() {    //Initialize

        String oneLL = Integer.toString((int) (Math.random() * 1000000));
        String twoLL = Integer.toString((int) (Math.random() * 1000000));
        int sumLL = Integer.parseInt(oneLL) + Integer.parseInt(twoLL);

        LinkedList<Integer> oneLLList = new LinkedList<>();
        LinkedList<Integer> twoLLList = new LinkedList<>();

        for (
                int i = oneLL.length() - 1;
                i >= 0; i--) {
            oneLLList.add(Character.getNumericValue(oneLL.charAt(i)));
        }

        for (
                int i = twoLL.length() - 1;
                i >= 0; i--) {
            twoLLList.add(Character.getNumericValue((twoLL.charAt(i))));
        }

        LinkedList<Integer> resultLLLinkedList = AddTwoNumbers.add(oneLLList, twoLLList);
        StringBuilder resultLLStringBuilder = new StringBuilder();
        while (resultLLLinkedList.size() > 0) {
            resultLLStringBuilder.append(Character.forDigit(resultLLLinkedList.pop(), 10));
        }

        int resultLLInt = Integer.parseInt(resultLLStringBuilder.reverse().toString());

        assertEquals(sumLL, resultLLInt);
    }
}