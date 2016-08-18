
public class binaryDigitAddition {
    public static void main(String[] args) {
        int n = 4, j = 0;
        int[] a = {0,1,0};

        int[] b = {0,1,1};

        int sum[] = new int[100] ;

        int remainder = 0, k = a.length -1 ;

        while(k >= 0 && k >= 0) {
            sum[j++] = (a[k] + b[k] + remainder ) % 2;
            remainder = (a[k] + b[k] + remainder ) / 2;
            k--;
        }
        if (remainder != 0)
            sum[j++] = remainder;

        System.out.println("ans is :");

        while (j >= 0)
            System.out.print(sum[j--] + " ");
    }
}
