import java.util.Scanner;

public class getXslRowOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter integer");
        int n = sc.nextInt();
        char[] str = new char[50];  // To store result (Excel column name)
        int i = 0;  // To store current index in str which is result


        while(n > 0) {
         // Find remainder
            int rem = n%26;

            // If remainder is 0, then a 'Z' must be there in output
            if (rem==0)
            {
                str[i++] = 'Z';
                n = (n/26)-1;
            }
            else // If remainder is non-zero
            {
                str[i++] = (char) ((rem-1) + 'A');
                n = n/26;
            }
        }
//        System.out.println("array list is : " + list);
        System.out.print("xsl row is :   ");

        for(char temp : str) {
            System.out.print(temp + " ");
        }

    }
}
