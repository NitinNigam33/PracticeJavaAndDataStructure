class MergeSortedLinkedListIterative {

    static Node node1;
    static Node node2;


    public static void main(String a[]) {
        node1 = new Node(7);
        MergeSortedLinkedListIterative m = new MergeSortedLinkedListIterative();
        m.addElement(new Node(9), node1);
        m.addElement(new Node(13), node1);
        node2 = new Node(2);
        m.addElement(new Node(10), node2);
        m.addElement(new Node(12), node2);
        Node  temp1 = node1;
        Node temp2 = node2;
        System.out.println("Inserted List are");
        while (temp1 != null) {
            System.out.print(temp1.value +" -> ");
            temp1 = temp1.next;
        }
        System.out.println("null");

        while (temp2 != null) {
            System.out.print(temp2.value +" -> ");
            temp2 = temp2.next;
        }
        System.out.println("null");

        Node m1 = m.merge();
        System.out.println("Sorted Merge list");
        while (m1 != null) {
            System.out.print(m1.value +" -> ");
            m1 = m1.next;
        }
        System.out.println("null");
    }


    void addElement(Node n, Node node) {
        Node temp = node;
        if (node == null)
            node = n;
        while (temp.next != null)
            temp = temp.next;
        temp.next = n;
    }

    Node mergeNode;

    Node merge() {
        int i = 0;

        while (node1 != null && node2 != null) {
            int lValue = node1.value;
            int rValue = node2.value;
            if (lValue < rValue) {
                merge(i, node1);
                node1 = node1.next;

            } else {
                merge(i, node2);
                node2 = node2.next;
            }

            i++;
        }

        while (node1 != null) {
            mergeNodes(i, node1);
            node1 = node1.next;
        }
        while (node2 != null) {
            mergeNodes(i, node2);
            node2 = node2.next;
        }
        return mergeNode;
    }

    /**
     * core logic
     * @param i
     * @param node
     */
    private void mergeNodes(int i, Node node) {
        int j;
        Node temp;
        temp = mergeNode;
        j = i;
        while (j != 1) {
            temp = temp.next;
            j--;
        }
        temp.next = node;
    }

    private void merge(int i, Node node) {
        if (mergeNode == null) {
            mergeNode = node;
        } else {
            mergeNodes(i, node);
        }

    }

    static class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }
}
