package AlgorithmsEasy;

public class ValidateBrackets {

    public static boolean validate(String input) {
        if (input.length() > 2) {
            switch (input.charAt(0)) {
                case '(':
                    return validate(input.substring(1, input.length() - 1)) && input.charAt(input.length() - 1) == ')';
                case '{':
                    return validate(input.substring(1, input.length() - 1)) && input.charAt(input.length() - 1) == '}';
                case '[':
                    return validate(input.substring(1, input.length() - 1)) && input.charAt(input.length() - 1) == ']';
            }
        } else if (input.length() == 2) {
            switch (input.charAt(0)) {
                case '(':
                    return input.charAt(1) == ')';
                case '[':
                    return input.charAt(1) == ']';
                case '{':
                    return input.charAt(1) == '}';
            }
        } else return input.length() == 0;
        return false;

    }
}
