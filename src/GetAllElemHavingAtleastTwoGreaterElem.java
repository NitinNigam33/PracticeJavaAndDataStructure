import java.util.Arrays;
import java.util.Scanner;

/**
 * Find all elements in array which have at-least two greater elements
 * @author NitinNigam
 *
 */
public class GetAllElemHavingAtleastTwoGreaterElem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of Array");
		int n = sc.nextInt();
		
		if(n < 2) {
			System.out.println("please insert more elem than 2");
			System.exit(0);
		}
		
		System.out.println("enter the Array elements");
		int[] arr = new int[n];
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("All elements having atleast 2 greater elements via sorting are :" +Arrays.toString( getElemUsingSorting(arr, n) ));
		System.out.println("All elements having atleast 2 greater elem by efficient way are: " +Arrays.toString( getElemWithoutSorting(arr, n) ));
		sc.close();
	}

	private static int[] getElemWithoutSorting(int[] arr, int n) {
		int[] res = new int[n-2];
		int first_max = -1;
		int second_max = -1;
		for(int i=0; i<n; i++) {
			if(arr[i] > first_max) {
				second_max = first_max;
				first_max = arr[i];
			}
			if(arr[i] > second_max && arr[i] != first_max) {
				second_max = arr[i];
			}
		}
		int index =0;
//		System.out.println("debug" +second_max);
		for(int temp : arr) {
			if(temp < second_max) {
				res[index++] = temp;
			}
		}
		
		return res;
	}

	private static int[] getElemUsingSorting(int[] arr, int n) {
		int[] res = new int[n-2];
		Arrays.sort(arr);
		for(int i =0; i < n-2; i++) {
			res[i] = arr[i];
		}
		return res;
	}

}
