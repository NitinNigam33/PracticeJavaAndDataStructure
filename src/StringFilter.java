// remove 'b' and 'ac' from string.
public class StringFilter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String a="abaacc";
        String res="";

        for(int i = 0 ;i < a.length() ;i++){
            char c = a.charAt(i);
            if(c=='b'){
                continue;
            }else if(c=='a' && i+1 < a.length() && a.charAt(i+1)=='c'){
                i++;
            }else
                res = res+c;
        }

        System.out.println(res);

    }

}