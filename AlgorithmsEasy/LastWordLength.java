package AlgorithmsEasy;


public class LastWordLength {
    /**
     * Finds the length of the last word in a string (defined as a range of characters after the last space character)
     *
     * @param s a string of words, must contain an least one non-space character
     * @return the length of the last word
     */
    public static int find(String s) {
        s = s.trim();

        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ') return s.length() - 1 - i;
        }

        return s.length();
    }

}
