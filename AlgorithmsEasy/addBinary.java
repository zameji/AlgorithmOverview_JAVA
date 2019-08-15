package AlgorithmsEasy;

//take two strings representing a binary number, return their sum as string
public class addBinary {

    public static String add(String one, String two) {

        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = one.length() - 1;
        int j = two.length() - 1;


        while (i >= 0 || j >= 0 || carry == 1) {
            carry += (i >= 0 ? one.charAt(i--) - '0' : 0);
            carry += (j >= 0 ? two.charAt(j--) - '0' : 0);
            result.insert(0, carry % 2);
            carry >>= 1;

        }

        return result.toString();

    }

}
