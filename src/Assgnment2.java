import java.util.HashMap;
import java.util.Scanner;
public class Assgnment2 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("pleasse enter string of brackets");
        Integer count = new Integer(0);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            for(char _char :s.toCharArray()) {
                Character c = _char;
                count = hm.get(c);
                int res = c.compareTo('{');
                int res1 = c.compareTo('[');
                int res2 = c.compareTo('(');
                if( hm.get(c) == null && ( res == 0 || res1 == 0 || res2 == 0) ) {
                    System.out.println("get1");
                    hm.put(c, 1);
                    //System.out.println("get2" + hm);
                } else if( res == 0 || res1 == 0 || res2 == 0 ) {
                  hm.put(c, ++count);
                } else {
                  hm.put(c, --count);
                }
            }
            System.out.print("map is : " +hm);
        }
    }
}