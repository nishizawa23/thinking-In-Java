package reusing;

import java.util.*;

class A {
	public A (int a){
		System.out.println("A construction a : "+a);
	}	
}

public class Exercise8 extends A{

	Exercise8(){
		super(11);
		System.out.println("Exercise8  construction no arg");
	}

	Exercise8(int a){
		super(a);
		System.out.println("Exercise8  construction a : " + a);
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise8 e1 = new Exercise8();
		Exercise8 e2 = new Exercise8(12);
	}
}
