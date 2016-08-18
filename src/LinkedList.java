import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinkedList<T extends Comparable<T>> implements Iterable<T> {

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();

        for (Iterator<T> i = this.iterator(); i.hasNext();) {
            result.append(i.next() + " ");
        }
        return result.toString();
    }

    /*******************************************************
     *
     * add first element
     *
     ********************************************************/
    public void addFirst(T item) {
        head = new Node<T>(item, head);
    }

    /*******************************************************
     *
     * merge sort linked list
     *
     ********************************************************/
    public void mergeSortLinkedList(LinkedList<T> linkedList) {
        head = sortLinkedList(linkedList.head);
    }

    private Node<T> sortLinkedList(Node<T> head) {

        if (head == null || head.next == null)
            return head;

        int totalNumberOfElements = getCount(head);

        int mid = totalNumberOfElements / 2;

        Node<T> currentNode = head;
        Node<T> left = head;
        Node<T> right = null;

        int countHalf = 0;
        while (currentNode != null) {
            countHalf++;
            Node<T> next = currentNode.next;

            if (countHalf == mid) {
                currentNode.next = null;
                right = next;
            }
            currentNode = next;
        }



        Node<T> leftHalf = sortLinkedList(left);
        Node<T> rightHalf = sortLinkedList(right);
        Node<T> mergedLinkedList = merge(leftHalf, rightHalf);

        return mergedLinkedList;
    }

    private Node<T> merge(Node<T> left, Node<T> right) {
        Node<T> leftNode = left;
        Node<T> rightNode = right;

        Node<T> duplicateHead = new Node<T>(null, null);
        Node<T> currentNode = duplicateHead;

        while (leftNode != null || rightNode != null) {

            if (leftNode == null) {
                currentNode.next = new Node<T>(rightNode.data, null);
                rightNode = rightNode.next;
                currentNode = currentNode.next;

            } else if (rightNode == null) {
                currentNode.next = new Node<T>(leftNode.data, null);
                leftNode = leftNode.next;
                currentNode = currentNode.next;

            } else {
                if (compare(leftNode.data, rightNode.data) < 0) {
                    currentNode.next = new Node<T>(leftNode.data, null);
                    leftNode = leftNode.next;
                    currentNode = currentNode.next;

                } else if (compare(leftNode.data, rightNode.data) == 0) {
                    currentNode.next = new Node<T>(leftNode.data, null);
                    currentNode.next.next = new Node<T>(rightNode.data, null);
                    currentNode = currentNode.next.next;
                    leftNode = leftNode.next;
                    rightNode = rightNode.next;

                } else {
                    currentNode.next = new Node<T>(rightNode.data, null);
                    rightNode = rightNode.next;
                    currentNode = currentNode.next;
                }
            }
        }

        return duplicateHead.next;
    }

    private int getCount(Node<T> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    private int compare(T a, T b) {
        return a.compareTo(b);
    }

    /*******************************************************
     *
     * node class
     *
     ********************************************************/
    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    /*******************************************************
     *
     * iterator class
     *
     ********************************************************/
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {

        private Node<T> temp;

        public LinkedListIterator() {
            temp = head;
        }

        public boolean hasNext() {
            return temp != null;
        }

        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();
            T item = temp.data;
            temp = temp.next;
            return item;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenth of linkedlist..");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("enter the linkedlist add");
            int data = sc.nextInt();
            list1.addFirst(data);
        }

        System.out.println(list1);

        list1.mergeSortLinkedList(list1);
        System.out.println(list1);
    }
}