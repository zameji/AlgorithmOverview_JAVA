package AlgorithmsEasy;

/**
 * Parses a roman numeral returns its value as integer
 * Notation should use IV for 4, XL for 40, XC for 90, CD for 400 and CM for 900. Other subtractions are not allowed.
 * (i.e. 49 is XLVIV and not IL)
 *
 * @ param roman the roman notation,
 * @ returns the corresponding integer or 0 for empty strings
 */
public class RomanToInt {

    public static int convert(String roman) {
        if (roman.length() == 0) return 0;
        if (roman.length() == 1) {
            switch (roman.charAt(0)) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
            }

        }

        if (roman.charAt(0) == 'M') {
            return 1000 + convert(roman.substring(1));
        } else if (roman.charAt(0) == 'C' && roman.charAt(1) == 'M') {
            return 900 + convert(roman.substring(2));
        } else if (roman.charAt(0) == 'C' && roman.charAt(1) == 'D') {
            return 400 + convert(roman.substring(2));
        } else if (roman.charAt(0) == 'X' && roman.charAt(1) == 'C') {
            return 90 + convert(roman.substring(2));
        } else if (roman.charAt(0) == 'I' && roman.charAt(1) == 'X') {
            return 9 + convert(roman.substring(2));
        } else if (roman.charAt(0) == 'X' && roman.charAt(1) == 'L') {
            return 40 + convert(roman.substring(2));
        } else if (roman.charAt(0) == 'I' && roman.charAt(1) == 'V') {
            return 4 + convert(roman.substring(2));
        } else if (roman.charAt(0) == 'C') {
            return 100 + convert(roman.substring(1));
        } else if (roman.charAt(0) == 'D') {
            return 500 + convert(roman.substring(1));
        } else if (roman.charAt(0) == 'L') {
            return 50 + convert(roman.substring(1));
        } else if (roman.charAt(0) == 'X') {
            return 10 + convert(roman.substring(1));
        } else if (roman.charAt(0) == 'V') {
            return 5 + convert(roman.substring(1));
        } else if (roman.charAt(0) == 'I') {
            return 1 + convert(roman.substring(1));
        } else {
            System.out.println(roman);
            return 0;
        }
    }

}