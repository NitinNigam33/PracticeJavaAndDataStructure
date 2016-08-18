
// reverse linked list in group of k elements
public class ReverseLLInGroup {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(head, 2);
        head.append(head, 3);
        head.append(head, 4);
        head.append(head, 5);
        head.append(head, 6);
        head.append(head, 7);
        head.append(head, 8);

        System.out.println("list inseted");
        head.display();

        ReverseLLInGroup obj = new ReverseLLInGroup();
        int k = 3;
        Node result = obj.reverseInGroup(head, k);
        System.out.println("reversed in group ");
        result.display();
    }

    private Node reverseInGroup(Node head, int k) {
        Node curr = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while(count < k && curr != null ){
            next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if(next != null) {
            head.next = reverseInGroup(next, k);
        }
        return prev;

    }
}
