package AlgorithmsEasy;

public class LastWordLength {

    public static int find(String s) {
        s = s.trim();

        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ') return s.length() - 1 - i;
        }

        return s.length();
    }

}
