package exceptions;

import exceptions.Exercise1;
import java.util.*;

class MyExceprtion1 extends Exception {
	String mString;
	MyExceprtion1(String mString){
		super(mString);
			this.mString = mString;
	}
}

public class Exercise4{

	public void f() throws MyExceprtion1{
		throw new MyExceprtion1("hello");
	}

	public static void main(String[] args) {
		try {
			new Exercise4().f();
		} catch(MyExceprtion1 e){
			e.printStackTrace(System.out);
			System.out.println(e.mString);
		} finally{
			System.out.println("i am here");
		}
		
	}
} 
