import java.util.ArrayList;
import java.util.Scanner;

public class getXslRowOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter integer");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();


        while(n > 0) {

            if(n > 27) {
                int var = n / 26;
                list.add(var + 64);
                n = n - (24 + var);
                System.out.println(" 1 :" +n);
            } else if (n > 1) {
                list.add(n + 64);
                n = n-26;
                System.out.println(" 2 : " +n);
            }
        }
//        System.out.println("array list is : " + list);
        System.out.print("xsl row is :   ");

        for(int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            char ch = (char) temp;
            System.out.print(ch + " ");
        }

    }
}
