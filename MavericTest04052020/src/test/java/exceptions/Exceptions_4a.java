package exceptions;
import exceptions.Exceptions_4a.FourthException;
//import exceptions.Exceptions_4a.FourthException;
import exceptions.Exception4a.*;
import exceptions.*;

public class Exceptions_4a {
	public static void main(String[] args) throws ThirdException {
		try{
			rethrow("abcde");
		}catch(FirstException | SecondException | ThirdException| FourthException e){
			//below assignment will throw compile time exception since e is final
			//e = new Exception();
			System.out.println(e.getMessage());
		}
	}
	static void rethrow(String s) throws FirstException, SecondException,
			ThirdException,FourthException {
		try {
			if (s.equals("Second"))
							throw new FirstException("First");
			else if (s.equals("Second"))
							throw new SecondException("Second");
			else if(s.equalsIgnoreCase("Third"))
							throw new ThirdException("Third");
			else 
							throw new FourthException("Fourth");
				} 
		catch (Exception e) {
			//below assignment disables the improved rethrow exception type checking feature of Java 7
			// e=new ThirdException();
			throw e;
		}
	}
	static class FirstException extends Exception {
		public FirstException(String msg) {
			super(msg);
		}
	}
	static class SecondException extends Exception {
		public SecondException(String msg) {
			super(msg);
		}
	}
	static class ThirdException extends Exception {
		public ThirdException(String msg) {
			super(msg);
		}
	}
	static class FourthException extends Exception {
		public FourthException(String msg) {
			super(msg);
		}
	}

}
