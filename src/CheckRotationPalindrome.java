public class CheckRotationPalindrome {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isRotationOfPalindrome("daaaa"));
    }

    static boolean isRotationOfPalindrome(String str) {
        // If string iteself is palindrome
        if (isPalindrome(str))
            return true;

        // Now try all rotations one by one
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            String str1 = str.substring(i + 1, n);
            String str2 = str.substring(0, i + 1);

            // System.out.println("str1" + str1);
            // System.out.println("str2" + str2);
            // Check if this rotation is palindrome
            String str3 = str1.concat(str2);
            if (isPalindrome(str3))
                return true;
        }
        return false;
    }

    // A utility function to check if a string str is palindrome
    static boolean isPalindrome(String s) {
        System.out.println(s);
        char[] str = s.toCharArray();
        // Start from leftmost and rightmost corners of str
        int l = 0;
        int h = str.length - 1;

        // Keep comparing characters while they are same
        while (h > l)
            if (str[l++] != str[h--])
                return false;

        // If we reach here, then all characters were matching
        return true;
    }

}