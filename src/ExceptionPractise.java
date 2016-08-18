
public class ExceptionPractise  {
	public static void main (String args[]) throws ArithmeticException  {
		int i = 1 ;
		int j = 10;
		int c= j/i;
		
		System.out.print(c);
		try {
			int c1 = j/0;
		}
		catch(ArithmeticException e) {
			System.out.print("hi");
			throw new ArithmeticException("no. can't divide by zero");
		}
	}
}
