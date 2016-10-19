
public class ReverseStringWorldWise {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "   abc    cde   abc abc nitin nigam      ";
        System.out.println("inserted string :" + str);
        reverseStringWorldWise(str);
    }

    private static void reverseStringWorldWise(String str) {
        char[] s = removeExtraSpace(str.toCharArray());
        int beginWord = 0;
        int temp = 0;
        int i =0;
        while(i <= s.length -1) {
            if(s[i] == ' ' || i == s.length -1) {
                temp = i-1;
                if(i == s.length -1) {
                    temp = i;
                }
                reverseCharArray(s, beginWord, temp);
                if(i != s.length -1) {
                    while(s[i] == ' ')
                        i++;
                    beginWord = i;
                }
            }
            i++;
        }

        reverseCharArray(s, 0, s.length-1);

        char[] res = removeExtraSpace(s);
        System.out.println();
        System.out.println("string after reverse word wise :");
        System.out.print(res);

    }

    private static void reverseCharArray(char[] s, int beginWord, int temp) {
//        System.out.println(" beginWord " + beginWord + " temp "+temp);
        while(beginWord < temp) {
            char tempChar = s[temp];
            s[temp--] = s[beginWord];
            s[beginWord++] = tempChar;
        }
//        System.out.println("string after reverse word wise");
//        for(char elem : s) {
//            System.out.print(elem +" ");
//        }
    }

    private static char[] removeExtraSpace(char[] charArray) {
        int i = 0, j= 0;
        StringBuffer sb = new StringBuffer();
        int len = charArray.length -1;

        if(charArray[0] == ' ') {
//            System.out.println(charArray[i]);
            i++;
            while(charArray[i] == ' ') {
                i++;
            }
        } //checking starting extra spaces

        if(charArray[len] == ' ') {
            len--;
            while(charArray[len] == ' ') {
                len--;
            }
        } // checking ending extra space

        while(i <= len) {
            while(charArray[i] == ' ') {
                sb.append(' ');
                while(charArray[i] == ' ') {
                    i++;
                }
            }
            sb.append(charArray[i]);
            i++;
        }
//        System.out.println("after remove extra space :" + sb.toString());
        return sb.toString().toCharArray();
    }

}
