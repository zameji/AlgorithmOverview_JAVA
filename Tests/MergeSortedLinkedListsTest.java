package Tests;

import AlgorithmsEasy.MergeSortedLinkedLists;
import AlgorithmsMedium.MergeSort;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedLinkedListsTest {

    @Test
    public void merge() {

        LinkedList<Integer> oneLLList = new LinkedList<>();
        LinkedList<Integer> twoLLList = new LinkedList<>();

        boolean correct;

        //randomize testarr2
        int[] testarr = new int[(int) (Math.random() * 1000)];
        for (int i = 0; i < testarr.length; i++) {
            int rand = (int) (Math.random() * testarr.length);
            testarr[i] = rand;
        }
        testarr = MergeSort.sort(testarr);
        for (int i : testarr) {
            oneLLList.add(i);
        }

        //randomize testarr2
        int[] testarr2 = new int[(int) (Math.random() * 1000)];
        for (int i = 0; i < testarr2.length; i++) {
            int rand = (int) (Math.random() * testarr.length);
            testarr2[i] = rand;
        }
        testarr2 = MergeSort.sort(testarr2);
        for (int i : testarr2) {
            twoLLList.add(i);
        }

        //merge testarr + testarr2
        int[] mergearr = new int[testarr.length + testarr2.length];
        System.arraycopy(testarr, 0, mergearr, 0, testarr.length);
        System.arraycopy(testarr2, 0, mergearr, 0 + testarr.length, testarr2.length);

        mergearr = MergeSort.sort(mergearr);

        Object[] resultLL = MergeSortedLinkedLists.merge(oneLLList, twoLLList).toArray();
        int[] result = new int[resultLL.length];
        for (int i = 0; i < resultLL.length; i++) {
            result[i] = (int) resultLL[i];
        }
        assertArrayEquals(mergearr, result);
    }
}