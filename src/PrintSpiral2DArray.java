public class PrintSpiral2DArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("2D array is");
        for (int[] a : arr) {
            for (int elem : a) {
                System.out.print(elem + "  ");
            }
            System.out.println();
        }
        printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        int i = 0, j = 0, R = 2, C = 2, dir = 0; // 3 * 3 matrix

        System.out.println("Spiral order of array");
        while (i <= R && j <= C) {
            if (dir == 0) {
                for (int k = j; k <= C; k++) {
                    System.out.print(arr[i][k] + " -> ");
                }
                i++;
            } else if (dir == 1) {
                for (int k = i; k <= R; k++) {
                    System.out.print(arr[k][C] + " -> ");
                }
                C--;
            } else if (dir == 2) {
                for (int k = C; k >= j; k--) {
                    System.out.print(arr[R][k] + " -> ");
                }
                R--;
            } else if (dir == 3) {
                for (int k = R; k >= i; k--) {
                    System.out.print(arr[k][j] + " -> ");
                }
                j++;
            }
            dir = (dir + 1) % 4;
        }
        System.out.print("null");
    }
}
