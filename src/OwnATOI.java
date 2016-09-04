public class OwnATOI {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "1.2";
        int val = myAtoi(str);
        System.out.println("Integer value : " + val);
    }

    private static int myAtoi(String s) {
        if (s == null)
            return 0;

        int res = 0; // Initialize result
        int sign = 1; // Initialize sign as positive
        int i = 0; // Initialize index of first digit

        char[] str = s.toCharArray();

        // If number is negative, then update sign
        if (str[0] == '-') {
            sign = -1;
            i++; // Also update index of first digit
        }

        for (; i < str.length; ++i) {
            if(str[i] == '.')
                break;
            res = res * 10 + str[i] - '0';
        }

        // Return result with sign
        return sign * res;
    }

}
