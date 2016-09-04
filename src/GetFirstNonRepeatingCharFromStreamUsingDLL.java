public class GetFirstNonRepeatingCharFromStreamUsingDLL {

    static node head = null, tail = null;

    /**
     * @param args
     */
    public static void main(String[] args) {
        findFirstNonRepeating();
    }

    class node {
        char a;
        node next, prev;
    }

    // A utility function to append a character x at the end
    // of DLL. Note that the function may change head and tail
    // pointers, that is why pointers to these pointers are passed.
    void appendNode(char x) {
        node temp = new node();
        temp.a = x;
        temp.prev = temp.next = null;

        if (head == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    // A utility function to remove a node 'temp' fromt DLL.
    // Note that the function may change head and tail pointers,
    // that is why pointers to these pointers are passed.
    void removeNode(node temp) {
        if (head == null)
            return;

        if (head == temp)
            head = (head).next;
        if (tail == temp)
            tail = (tail).prev;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;

        temp = null;
    }

    static void findFirstNonRepeating() {
        // inDLL[x] contains pointer to a DLL node if x is present
        // in DLL. If x is not present, then inDLL[x] is NULL
        node inDLL[] = new node[256];

        // repeated[x] is true if x is repeated two or more times.
        // If x is not seen so far or x is seen only once. then
        // repeated[x] is false
        boolean repeated[] = new boolean[256];

        GetFirstNonRepeatingCharFromStreamUsingDLL obj = new GetFirstNonRepeatingCharFromStreamUsingDLL();
        // Initialize the above two arrays
        for (int i = 0; i < 256; i++) {
            inDLL[i] = null;
            repeated[i] = false;
        }

        // Let us consider following stream and see the process
        String s = "geeksforgeeksandgeeksquizfor";
        char stream[] = s.toCharArray();

        for (int i = 0; i < stream.length; i++) {
            char x = stream[i];
            System.out.println("reading.. : " +x +" from stream ");

            // We process this character only if it has not occurred
            // or occurred only once. repeated[x] is true if x is
            // repeated twice or more.s
            if (!repeated[x]) {
                // If the character is not in DLL, then add this at
                // the end of DLL.
                if (inDLL[x] == null) {
                    obj.appendNode(stream[i]);
                    inDLL[x] = tail;
                } else // Otherwise remove this character from DLL
                {
                    obj.removeNode(inDLL[x]);
                    inDLL[x] = null;
                    repeated[x] = true; // Also mark it as repeated
                }
            }

            // Print the current first non-repeating character from
            // stream
            if (head != null)
                System.out.println("First non-repeating character so far is " + head.a);
        }
    }

}
