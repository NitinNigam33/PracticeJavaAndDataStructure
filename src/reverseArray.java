
public class reverseArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
       int[] arr = {1,2,3,4};
       int[] b = reverse(arr);
       arr = b;
       for(int a : arr)
           System.out.println(a);

    }

    private static int[] reverse(int[] arr) {
        int len = arr.length;
        int[] b = new int[len];

        int j =0;
        for(int i = len-1; i >= 0; i--) {
            b[j++] = arr[i];
        }
        return b;
    }

}
