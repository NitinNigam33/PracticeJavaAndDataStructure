import java.util.ArrayList;
public class Iterator
{
    @SuppressWarnings("rawtypes")
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Iterator to traverse the list
        java.util.Iterator iterator = list.iterator();

        System.out.println("List elements : ");
        System.out.print(iterator.next()+ " ");
        iterator.remove();

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }
        System.out.println();
        System.out.println("removed that element");

        java.util.Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next()+ " ");
        }


        System.out.println();
    }
}