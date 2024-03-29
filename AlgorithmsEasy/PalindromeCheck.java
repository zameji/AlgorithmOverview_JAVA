package AlgorithmsEasy;


public class PalindromeCheck {
    /**
     * Checks whether a string is a palindrome
     *
     * @param candidate a string to be checked
     * @return true if string is a palindrome or has length 0
     */
    public static boolean check(String candidate) {
        if (candidate.length() == 0 || candidate.length() == 1) {
            return true;
        }

        if (candidate.charAt(0) == candidate.charAt(candidate.length() - 1)) {
            return check(candidate.substring(1, candidate.length() - 1));
        } else {
            return false;
        }

    }

}
