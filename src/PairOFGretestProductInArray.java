import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;

public class PairOFGretestProductInArray {
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Brutal Force gretest product in entered array is: " + getGreatestProductBrutalForce(arr, n) );
		System.out.println("gretest product in entered array is: " + getGreatestProduct(arr, n) );
	}

	private static int getGreatestProductBrutalForce(int[] arr, int n) {
		int result = -1;
		for(int i = 0; i < n; i++) {
			for(int j =0 ; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					if(arr[j] * arr[k] == arr[i])
						result = java.lang.Math.max(result, arr[i]);
				}
			}
		}
		return result;
	}

	private static int getGreatestProduct(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], ++count);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		Arrays.sort(arr); //sort asc and traverse opposite to get greatest element first
//		System.out.println("debug" + map.toString() +" sorted array is : " + Arrays.toString(arr));
		
		for(int i = n-1; i > 0; i--) {
			
			for(int j = 0; j < i && arr[j] <= java.lang.Math.sqrt(arr[i]); j++) {
				
				if(arr[i] % arr[j] == 0) {
					
					int res = arr[i]/ arr[j];
//					System.out.println("map value : " + map.containsKey(res));
					
					/**
					 * we have to check the pair of product is present or not
					 * we already check mod("%") one factor is present and
					 * another divided ans i.e. if res is present in hash-map then return
					 */
					if(res != arr[j] && map.containsKey(res) ) {
						return arr[i];
					}
					
					/**
					 * special case to handle the case 
					 * like arr[i] = 4 and arr[j] = 2
					 */
					else if(res == arr[j] && map.get(res) > 1) {
						return arr[i];
					}
				}
			}
		}
		
		return -1;
	}
}
