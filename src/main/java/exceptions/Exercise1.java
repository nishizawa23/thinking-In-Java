package exceptions;

import exceptions.Exercise1;
import java.util.*;

class MyException extends Exception {
	MyException(String mString){
		super(mString);
	}
}

public class Exercise1{

	public void f() throws MyException{
		throw new MyException("hello");
	}

	public static void main(String[] args) {
		try {
			new Exercise1().f();
		} catch(MyException e){
			e.printStackTrace(System.out);
		} finally{
			System.out.println("i am here");
		}
		
	}
} 
