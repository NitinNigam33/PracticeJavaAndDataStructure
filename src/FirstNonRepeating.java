import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeating {

    public static void main(String[] args) {

        int arr[] = {4,1,2,3,2,3};
        boolean result  = false;

        Map<Integer, Integer> hash = new LinkedHashMap<Integer, Integer>(); //it maintain insertion order

        for (int i = 0; i < arr.length; i++) {

            if (hash.containsKey(arr[i]))

                hash.replace(arr[i], hash.get(arr[i]) + 1);

            else

                hash.put(arr[i], 1);

        }
//        System.out.println(hash);

        for(Entry<Integer, Integer> itr : hash.entrySet()) {
            if(itr.getValue() == 1) {
                System.out.println("first non repeating char" +itr.getKey());
                result = true;
                break;
            }

        }

        if(!result) {
            System.out.println("no non repeating characters");
        }

    }
}