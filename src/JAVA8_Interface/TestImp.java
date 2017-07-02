package JAVA8_Interface;

public class TestImp implements Test {
    static boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    public static void main(String args[]) {
        TestImp obj = new TestImp();
        obj.print("");
        isNull("abc"); // shadowing of the method at complie time. not overriding 
        /*if we make interface method as default instead of default then we output :
            Impl Null Check
            MyData Print::
            Impl Null Check*/
    }
}
