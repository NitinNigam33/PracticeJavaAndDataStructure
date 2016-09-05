
public class MinimumWindowContainsAllCharacter {

    static int minWindowBegin, minWindowEnd;

    /**
     * @param args
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter the string for searching");
//        String s = sc.nextLine();
//        System.out.println("please enter string for search the characters in string");
//        String t = sc.nextLine();
        String s = "acbbaca";
        String t = "aba";

        boolean result = minWindow(s, t);

        if (result) {
//            String res = s.substring(minWindowEnd, minWindowEnd);
            System.out.println("min window contain all character");
            while(minWindowEnd >= minWindowBegin) {
                System.out.print(s.charAt(minWindowBegin) + " ");
                minWindowBegin++;
            }
        } else {
            System.out.println("please enter the second string which are present in first string");
        }

    } //driven function

    private static boolean minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        int needToSearch[] = new int[256];

        for (char c : t.toCharArray()) {
            needToSearch[c]++;
        } // Initialize all character of t string in needToSearch


        int hasFound[] = new int[256];
        int minWindowLen = Integer.MAX_VALUE;
        int count = 0;

        for (int begin = 0, end = 0; end < sLen; end++) {
            if (needToSearch[s.charAt(end)] == 0)
                continue; //skip if character is  not present in needToSearch

            hasFound[s.charAt(end)]++; //increment char frequency

            if (hasFound[s.charAt(end)] <= needToSearch[s.charAt(end)])
                count++; //if char is found then increment

            if (count == tLen) {
                while (needToSearch[s.charAt(begin)] == 0 || hasFound[s.charAt(begin)] > needToSearch[s
                        .charAt(begin)]) {
                    if (hasFound[s.charAt(begin)] > needToSearch[s.charAt(begin)]) {
                        hasFound[s.charAt(begin)]--;
                    }
                    begin++;
                } //if character are not in needToSearch or hasFound > needToSeach means character of begin is more then we can move are starting pointer to right..

                int windowLen = end - begin + 1;
                if (windowLen < minWindowLen) {
                    minWindowBegin = begin;
                    minWindowEnd = end;
                    minWindowLen = windowLen;
//                    System.out.println(minWindowBegin +" : " +minWindowEnd);
                } // set minWindow if we found less then that..
            }
        }
        return (count == tLen);
    }

}
