package exceptions;

import java.util.*;

class Hello {
	public void sayHelo(){
		System.out.println("hello world");
	}
}

public class Exercise2{
	public Hello mHello = null;
	public static void main(String[] args) {
		try {
			new Exercise2().mHello.sayHelo();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally hello");
		}
		
	}
} 
