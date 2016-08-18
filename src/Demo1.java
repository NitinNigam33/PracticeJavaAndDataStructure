// simple inheritance of calling parent child method obj can't abe to call its child method as obj is of type Demo2

public class Demo1 extends Demo2 {
	 void fun1() {
		 System.out.println("Demo1 fun");
	 }
		
	 public static void main(String[] args) {
	    Demo2 obj = new Demo1();
	    obj.fun();
	    //throw error obj.fun1();
	    //fun1(); if it is static method
	    
	    Demo1 obj1 = new Demo1();
	    System.out.println("-----------------------");
	    obj1.fun1();
	    obj1.fun();
	 }
}

class Demo2 {
    void fun() {
        System.out.println("Demo2 fun"); 
    }
}
