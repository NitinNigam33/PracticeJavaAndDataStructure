//A sample Java program to demonstrate HashMap and HashTable
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* Name of the class has to be "Main" only if the class is public. */
public class HashMap_MashTable
{
 public static void main(String args[])
 {
     //----------hashtable -------------------------
     Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
     ht.put(101," ajay");
     ht.put(101,"Vijay");
     ht.put(102,"Ravi");
     ht.put(103,"Rahul");
     ht.put(100,"Rahul");
//     ht.put(, "NotAllow");
     ht.put(107,""); //empty string
//     ht.put(108, null); //not allow throw null pointer exception
//     ht.put(null, "not  allow"); //not allow throw null pointer exception
     System.out.println("-------------Hash table--------------");
     for (Map.Entry m:ht.entrySet()) {
         System.out.println(m.getKey()+" "+m.getValue());
     }

     //----------------hashmap--------------------------------

     // it allow  one key to be null and values can be null

     HashMap<Integer,ArrayList<String>> hm=new HashMap<Integer,ArrayList<String>>();
     ArrayList<String> list = new ArrayList<String>();
     list.add("Amit");
     list.add("Vijay");
     hm.put(100,list);
     ArrayList<String> list1 = new ArrayList<String>(list);
     list1.add("Rahul");
     list1.add("Ram");
     hm.put(101, list1);
     hm.put(100, list1);
     hm.put(102, list);
//   hm.put(104,"Amit"); // hash map allows duplicate values
//   hm.put(101,"Vijay");
//   hm.put(102,"Rahul");
//   hm.put(102,"Ram");

     hm.put(108, null);
     hm.put(null, list);
     hm.put(null, list1);
     System.out.println("-----------Hash map-----------");
     for (Map.Entry m:hm.entrySet()) {
         System.out.println(m.getKey()+" "+m.getValue());
     }
 }
}
