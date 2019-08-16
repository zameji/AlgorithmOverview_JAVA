package AlgorithmsEasy;

/**
 * Finds the position in a string where a given substring begins
 *
 * @ param s the base string
 * @ param sub the sought substring
 * @ returns starting position of substring; if not found returns -1
 */

public class FindSubstring {

    public static int find(String s, String sub) {
        if (sub.length() == 0) return 0;

        boolean found;
        for (int i = 0; i < s.length() - sub.length() + 1; i++) {
            if (s.charAt(i) == sub.charAt(0)) {
                found = true;
                for (int j = 1; j < sub.length(); j++) {
                    if (s.charAt(i + j) != sub.charAt(j)) {
                        i = i + j;
                        found = false;
                        break;
                    }
                }
                if (found) return i;

            }
        }

        return -1;

    }

}
