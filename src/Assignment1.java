import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Nitin Nigam
 * Input from file and display all permutation of string in same row..
 *
 */
public class Assignment1 {
    /**
     * @param args
     * @return
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        //For input
        Scanner sc = new Scanner(System.in);

        //HashMap of string and arrayList
        HashMap<String, ArrayList<String>> countMap = new HashMap<String, ArrayList<String>>();

        //read input from file with n length
        System.out.println("please enter the lenth of file");
        int n = sc.nextInt();
        FileReader file = new FileReader("/home/nitin/Documents/nitin/java Algorithm Derek/readFileSample.txt");
        BufferedReader b_read = new BufferedReader(file);

        for(int i = 0; i <= n; i++) {
            //store string to temp
            String temp = b_read.readLine();

            //display stored string
            System.out.println("String element" + i + " :" + temp );

            //sort string to natural order
            String reserve = sortString(temp);

            //check if key of hashMap is not set then set key and for that key create new instance to ArrayList for generic type
            //important step to add the arrayElements in the existing key. Not create new instance...
            if (!countMap.containsKey(reserve)) {
                countMap.put(reserve, new ArrayList<String>());
            }

            //create list of arrays and add the new entry to their corresponding sorted string key
            ArrayList<String> list = countMap.get(reserve);
            list.add(temp);

            //add arrayList to their key
            countMap.put(reserve, list);
        }

        //Display HashMap using Entry collections
        for (Entry<String, ArrayList<String>> entry : countMap.entrySet()) {
            System.out.print(entry.getKey()+" => ");
            for(String keys : entry.getValue()){
                System.out.print(keys+" ");
            }
            System.out.println();
        }

        //close all used connection
        b_read.close();
        sc.close();
    }

    /**
     * use to sort the String
     * @param string
     * @return String
     */
    private static String sortString(String temp) {
        char[] temp1 = temp.toCharArray();
        Arrays.sort(temp1);
        String sorted = new String(temp1);
        return sorted;
    }

}
