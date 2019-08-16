package AlgorithmsEasy;


public class LongestCommonPrefix {
    /**
     * Finds the longest prefix that is shared by all strings in an array
     *
     * @param input non-empty array with strings
     * @return the longest found shared prefix
     */
    public static String get(String[] input) {

        int minLength = Integer.MAX_VALUE;
        StringBuilder out = new StringBuilder();

        for (String s : input) {
            int len = s.length();
            if (len < minLength) minLength = len;
        }

        for (int i = 0; i < minLength; i++) {
            char master = input[0].charAt(i);
            for (String s : input) {
                if (s.charAt(i) != master) return out.toString();
            }
            out.append(master);
        }

        return out.toString();

    }

}
