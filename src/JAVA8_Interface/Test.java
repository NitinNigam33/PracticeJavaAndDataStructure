package JAVA8_Interface;

public interface Test {
    default void print(String str) {
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check" + str);

        return str == null ? true : "".equals(str) ? true : false;
    }
}
