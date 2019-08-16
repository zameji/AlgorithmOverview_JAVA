package AlgorithmsEasy;

import java.util.LinkedList;

/**
 * Merges two linked lists into one
 *
 * @ param one a sorted non-empty linked list
 * @ param two a different sorted non-empty linked list
 * @ returns the combination of the two lists, sorted
 */
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
