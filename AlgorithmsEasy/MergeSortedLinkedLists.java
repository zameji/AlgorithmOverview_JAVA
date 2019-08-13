package AlgorithmsEasy;

import java.util.LinkedList;

public class MergeSortedLinkedLists {

    public static LinkedList<Integer> merge(LinkedList one, LinkedList two) {

        LinkedList<Integer> result = new LinkedList<>();
        while (one.size() > 0 && two.size() > 0) {
            if ((int) one.peek() < (int) two.peek()) {
                result.add((int) one.pop());
            } else {
                result.add((int) two.pop());
            }
        }

        while (one.size() > 0) {
            result.add((int) one.pop());
        }

        while (two.size() > 0) {
            result.add((int) two.pop());
        }

        return result;

    }

}
