/*when arrays are pass by function arguments,
it act as pointers pass by value*/
public class StringTest {

    static int check() {
        return 1;
    }

    public static void main(String[] argv) {
        // Create a string array containing one element.
        // This will create a reference so that any method
        // can assign a return String object in the first
        // element of the array.
        String[] strArray = new String[1];
        strArray[0] = "nitin";
        // Note, the array doesn't contain any String object yet.
        String2 obj = new String2();
        obj.assignString(strArray);

        System.out.println(strArray[0]);
        check(); //Improper as it has return type it should assign to some variable. but allowed by compiler
        System.out.println(check());
    }
}

class String2 {
    /**
     * Assign a string object to the first element of the input array.
     *
     * @param msg
     *            a String array.
     */
    public void assignString(String[] msg) {
        if (msg.length > 0) {
            msg[0] = new String("Ali");
        }
    }
}