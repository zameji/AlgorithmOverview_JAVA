package AlgorithmsMedium;

import java.util.HashMap;


public class LongestUniqueSubstring {
    /**
     * Find longest substring without the repetition of a characters
     *
     * @param input a string of characters
     * @return the length of the longest substring without repetitions
     */
    public static int find(String input) {
        HashMap<Character, Integer> seen = new HashMap<>();

        // we start with zero-length string
        String output = "";

        //two pointers: beginning of the substring and its end
        for (int start = 0, end = 0; end < input.length(); end++) {
            char current = input.charAt(end);
            if (seen.containsKey(current)) {
                //we replace start only if the currently repeated letter is in the current longest substring
                start = Math.max(seen.get(current), start + 1);
            }

            //if the current unique substring is longer than the longest seen, update
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            seen.put(current, end);
        }

        return output.length();


    }

}
