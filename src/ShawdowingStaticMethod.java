// file name: Main.java
class A {
	static void fun() {
		System.out.println("A.fun()");
	}
}

class B extends A { 
	static void fun() { 
		System.out.println("B.fun()");
	}
}

public class ShawdowingStaticMethod {
	public static void main(String args[]) {
		A a = new B();
		a.fun(); // prints A.fun() [if this function is not static then it print B.fun()] [WARNING: static function should call by class name not object eg: A.fun()] 
		A.fun();
		B b = new B();
		b.fun(); //print B.fun()
		B.fun();
	}
}

