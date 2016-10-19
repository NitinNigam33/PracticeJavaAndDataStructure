import java.util.Arrays;



public class LongestIncreasingSubsequence {

    static int max_ref;
    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Entered Array is : " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Length of LIS using with Recursion without DP is : " +  lisWithoutDP( arr, n));
        System.out.println("Length of LIS using with Tabulation & DP is : " +  lisWithDP( arr, n));
    }

    //Best approach with DP.
    //in this approach we not solve overlapping problem again n again
    private static int lisWithDP(int[] arr, int n) {
        int i,j,max = 1;
        int[] lis = new int[n];

        Arrays.fill(lis, 1);

        for(i = 1; i < n; i++) {
            for(j = 0; j < i; j++) {
                if(arr[i] > arr[j] && lis[i] < lis[j] +1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        System.out.println("Debug lis array is : " +Arrays.toString(lis));

        for(int a : lis) {
            if(max < a) {
                max = a;
            }
        }

        return max;
    }

    //wrapper function
    /**
     * Without using Dynamic programming. Using Recursion.
     * but there are so many overlapping problems to its best solution is by using DP
     */
    private static int lisWithoutDP(int[] arr, int n) {
        max_ref = 1;

        // The function _lis() stores its result in max
        _lis( arr, n);

        // returns max
        return max_ref;
    }

    private static int _lis(int[] arr, int n) {
        /* Base case */
        if (n == 1)
            return 1;

        // 'max_ending_here' is length of LIS ending with arr[n-1]
        int res, max_ending_here = 1;

        /* Recursively get all LIS ending with arr[0], arr[1] ...
           arr[n-2]. If   arr[i-1] is smaller than arr[n-1], and
           max ending with arr[n-1] needs to be updated, then
           update it */
        for (int i = 1; i < n; i++)
        {
            res = _lis(arr, i);
            if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }

        // Compare max_ending_here with the overall max. And
        // update the overall max if needed
        if (max_ref < max_ending_here)
           max_ref = max_ending_here;

        // Return length of LIS ending with arr[n-1]
        return max_ending_here;

    }

}
