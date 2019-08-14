package AlgorithmsEasy;

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
