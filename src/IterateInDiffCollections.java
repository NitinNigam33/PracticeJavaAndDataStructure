import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class IterateInDiffCollections {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add("nitin");
        list.add("nigam");
        list.add(3);

        System.out.println("1.. iterate arrayList using for simple");
        for(int i =0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("2.. iterate arrayList using for");
        for(Iterator itr = list.iterator(); itr.hasNext();) {
            System.out.print(itr.next() +" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("3.. iterate arrayList using while almost same as 2");
        Iterator itr2 = list.iterator();
        while(itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(3);

        System.out.println();
        System.out.println();
        System.out.println("4.. iterate arrayList using enhance for loop");
        for(int a : list2) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------------------");

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"nitin");
        map.put(2, "nigam");
        map.put(3, "abc");
        map.put(4, "xyz");

        System.out.println();
        System.out.println();
        System.out.println("1.. iterate HashMap using enhance for loop using Entry Set");
        for(Map.Entry<Integer, String> itr : map.entrySet() ) {
            System.out.print(itr.getKey() +" " + itr.getValue() + " :");
        }

        System.out.println();
        System.out.println();
        System.out.println("2.. iterate HashMap by while loop & using Iterator n Entry ");
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry pair = (Entry) itr.next();
            System.out.print(pair.getKey() +" " + pair.getValue() + " :");
        }

        System.out.println();
        System.out.println();
        System.out.println("3.. iterate HashMap using Seperate key and value in enhance for loop");
        System.out.print("keys are :");
        for(int a : map.keySet()) {
            System.out.print(a +" " );
        }
        System.out.print("values are :");
        for(String a : map.values()) {
            System.out.print(a +" " );
        }

        System.out.println();
        System.out.println();
        System.out.println("4.. iterate HashMap using Simple for using keySet");
        for(int a : map.keySet()) {
            System.out.print(a +" "+ map.get(a) + " : " );
        }

        Set<Integer> set = new HashSet<Integer>();
        set.add(9);
        set.add(8);
        set.add(7);
        set.add(6);

        System.out.println();
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("1.. iterate set using for Iterator");
        for(Iterator itr3 = set.iterator(); itr3.hasNext();) {
            System.out.print(itr3.next() +" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("2.. iterate set using Simple for");
        Object[] setArr = set.toArray();
        for(int i = 0 ; i < set.size(); i++) {
            System.out.print(setArr[i] +" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("3.. iterate set using enhance for");
        for(int a : set) {
            System.out.print(a + " ");
        }

    }

}
