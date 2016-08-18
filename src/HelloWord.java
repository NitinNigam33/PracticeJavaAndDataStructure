
import java.util.Scanner;

class HelloWord {
    static String strRev;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int l = str.length();
        strRev = String.valueOf(str.charAt(l-1));
        reverseFun(str, l-2);
        System.out.println(strRev);
    }
    
    public static void reverseFun(String s, int i) {
        strRev += String.valueOf(s.charAt(i));
        i--;
        if(i!=-1) {
            reverseFun(s, i);
        }
    }
}

