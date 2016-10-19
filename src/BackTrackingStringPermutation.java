import java.util.Scanner;

public class BackTrackingStringPermutation {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\"enter String for printing it's all permutations\"");
        String str = sc.nextLine();
        char charArray[] = str.toCharArray();

        System.out.println("Possible permutation of  Strings are: ");
        permute(charArray, 0, charArray.length - 1);

        sc.close();
    }

    private static void permute(char[] a, int l, int r) {
        int i;
        if (l == r)
            System.out.println(a);
        else
            for (i = l; i <= r; i++) {
                swap(a, l, i);
                permute(a, l + 1, r);
                swap(a, l, i); // backtrack
            }
    }

    private static void swap(char[] a, int l, int i) {
        char temp;
        temp = a[l];
        a[l] = a[i];
        a[i] = temp;
    }
}
