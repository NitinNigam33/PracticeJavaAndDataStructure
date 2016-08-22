import java.util.Scanner;


public class MemorizeFibonaciUsingRecursion {
    static int[] lookUp = new  int[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the limit of fibonacci series");
        int n = sc.nextInt();
        System.out.println("last term is : " +fibo(n));

        System.out.print(" fibonaci series is : ");
        for(int i= 0; i <= n; i++) {
            System.out.print(lookUp[i] + " ");
        }
    }
    private static int fibo(int n) {
        if(lookUp[n] == 0) {
            if(n <= 1) {
                lookUp[n] = n;
            } else {
                lookUp[n] = fibo(n-1) + fibo(n-2);
            }
        }
        return lookUp[n];
    }
}
