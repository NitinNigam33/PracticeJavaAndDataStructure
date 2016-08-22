/*Suppose we have a number n, let’s say 28. so corresponding to it we need to print the column name. We need to take remainder with 26.

If remainder with 26 comes out to be 0 (meaning 26, 52 and so on) then we put ‘Z’ in the output string and new n becomes n/26 -1 because here we are considering 26 to be ‘Z’ while in actual it’s 25th with respect to ‘A’.

Similarly if the remainder comes out to be non zero. (like 1, 2, 3 and so on) then we need to just insert the char accordingly in the string and do n = n/26.

Finally we reverse the string and print.

Example:
n = 700

Remainder (n%26) is 24. So we put ‘X’ in output string and n becomes n/26 which is 26.

Remainder (26%26) is 0. So we put ‘Z’ in output string and n becomes n/26 -1 which is 0.

Following is java implementation of above approach. */
import java.util.Scanner;

public class getXslRowOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter integer");
        int n = sc.nextInt();
        char[] str = new char[50]; // To store result (Excel column name)
        int i = 0; // To store current index in str which is result

        while (n > 0) {
            // Find remainder
            int rem = n % 26;

            // If remainder is 0, then a 'Z' must be there in output
            if (rem == 0) {
                str[i++] = 'Z';
                n = (n / 26) - 1;
            } else // If remainder is non-zero
            {
                str[i++] = (char) ((rem - 1) + 'A');
                n = n / 26;
            }
        }
        // System.out.println("array list is : " + list);
        System.out.print("xsl row is :   ");

        char[] res = reverse(str);

        for (char temp : res) {
            System.out.print(temp + " ");
        }

    }

    private static char[] reverse(char[] str) {
        int i = 0;
        int j = 0;
        while (str[j] >= 'A' && str[j] <= 'Z') {
            j++;
        }
        j--; // to get size -1

        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return str;
    }
}
