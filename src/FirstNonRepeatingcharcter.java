public class FirstNonRepeatingcharcter {

    public static void main(String[] args) {

        String s1 = "edbaabcd";

        char stringArray[] = s1.toCharArray();

        int i = 0;

        boolean flag = false;

        while (i < s1.length()) {

            if (s1.indexOf(stringArray[i], i + 1) == -1 && s1.lastIndexOf(stringArray[i], i - 1) == -1) {

                System.out.println("First Non Repeating Char is :" + stringArray[i]);

                flag = true;

                break;

            }

            i++;

        }

        if (flag != true) {

            System.out.println("repeating character not found");

        }

    }

}