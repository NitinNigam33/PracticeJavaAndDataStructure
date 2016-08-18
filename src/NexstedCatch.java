
public class NexstedCatch {
	public static void main (String args[]) throws Exception {
		int i = 1 ;
		int j = 10;
		int c= j/i;
		
		System.out.print(c);
		try {
			int c1 = j/0;
		}
		catch(ArithmeticException e) {
			System.out.print("hi");
			e.printStackTrace();
			throw new ArithmeticException("no. can't divide by zero");
		}
		
		catch(Exception e) {
			System.out.print("hello");
			throw new Exception("unk exception");
		}
		
	}	
}
