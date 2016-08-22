import java.util.Scanner;

public class CustomTree {
    public static void main(String[] args) {
        int N;
        System.out.println("please enter the length of 2-D array");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        char[][] link = new char[N][2];
        int[] root = new int[27];
        int[] visit = new int[N];

        for (int i = 0; i < N; i++) {
            link[i][0] = sc.next().charAt(0);
            link[i][1] = sc.next().charAt(0);

            // find out the roots which are present in first array
            int x = link[i][0] - 'a' + 1;
            int y = link[i][1] - 'a' + 1;
            if (root[x] == 0) {
                root[x] = 1;
            }
            root[y] = -1;
        }

        for (int i = 0; i <= 26; i++) {
            if (root[i] == 1) {
                custom_tree(link, N, (i + 96), 0);
                // custom_tree(link, visit, N, (i + 96), 0); //visit array is
                // just to add 2 check
                System.out.println();
            }
        }
    }

    // private static void custom_tree(char[][] link, int[] visit, int n, int
    // root, int padding) {
    // char ch = (char) root;
    // // System.out.println("root is" + ch);
    // print_elem(ch, padding);
    //
    // for (int i = 0; i < n; i++) {
    // one check is sufficient
    // if (link[i][0] == ch && visit[i] == 0) {
    // System.out.println("i is : "+ i);
    // visit[i] = 1;
    // custom_tree(link, visit, n, link[i][1], padding + 1);
    // }
    // }
    // }

    private static void custom_tree(char[][] link, int n, int root, int padding) {
        char ch = (char) root;
        // System.out.println("root is" + ch);
        print_elem(ch, padding);

        for (int i = 0; i < n; i++) {
            if (link[i][0] == ch) {
                custom_tree(link, n, link[i][1], padding + 1);
            }
        }

    }

    private static void print_elem(char ch, int padding) {
        for (int i = 0; i < padding; i++)
            System.out.print("   |");
        System.out.print(" --> " + ch);
        System.out.println();
    }
}