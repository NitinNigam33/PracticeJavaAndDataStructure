public class ForLoopRecursion {
    static int R = 3, C = 3;
    public static void main(String[] args) {
        String[][] str = { { "you", "we" }, { "have", "are"}, { "sleep", "eat", "drink" } };

        String temp[] = new String[3];
        print(str, 0, temp, 0);
    }

    /**
     * we call recursion inside for loop  : equivalent to 3 for loops in this case.
     * we access all member from one jagged array to all other member of other jagged array
     * @param str
     * @param strt
     * @param output
     * @param index
     */
    private static void print(String[][] str, int strt, String[] output, int index) {
        if (index == R) {
            for (int j = 0; j < index; j++)
                System.out.print(output[j] + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < str[strt].length; i++) {
//            System.out.println("strt : " +strt + "; i :" +i);
                output[index] = str[strt][i];
                print(str, strt + 1, output, index + 1);
        }
        return;

    }
}