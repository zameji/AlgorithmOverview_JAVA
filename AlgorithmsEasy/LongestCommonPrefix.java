package AlgorithmsEasy;

public class LongestCommonPrefix {

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
