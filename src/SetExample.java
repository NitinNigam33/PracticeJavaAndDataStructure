import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hash_set = new HashSet<String>();
        hash_set.add("Geeks");
        hash_set.add("For");
        hash_set.add("Geeks");
        hash_set.add("Example");
        hash_set.add("Set");
        hash_set.add("Set");
        hash_set.add("nitin");

        System.out.println("hashSet : " + hash_set); // unorders and unsorted generate with hash-function

        Set<String> tree_set = new TreeSet<String>(hash_set); //sorter order
        System.out.println("treeSet :" + tree_set);

        Set<String> linked_set = new LinkedHashSet<String>(hash_set);
        linked_set.add("nigam"); //this must be add in last as linkedHashSet preserve the order by which you insert the elements
        System.out.println(" linkedHashSet :" +linked_set);

    }
}
