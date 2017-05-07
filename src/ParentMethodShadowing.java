class SuperClass{
	public static void display() {
		System.out.println("Super class method");
	}
	
	public void print() {
		System.out.println("to be override...");
	}
}


public class ParentMethodShadowing extends SuperClass {
	
	public static void display() {
		System.out.println("child class method but not overriding");
	}
	
	public void print() {
		System.out.println("overided method");
	}
	
	public static void main(String[] args) {
		display();
		SuperClass obj = new SuperClass();
		obj.display();
		obj.print();
		
		SuperClass obj1 = new ParentMethodShadowing();
		obj1.display(); //as overriding is not occurred(due to static) so only parent class method is show.
		obj1.print();  // Override method
	}

}
