package initialization;

import java.util.*;

public class ConstructorWithThis {

	ConstructorWithThis(String s){
		System.out.println("Constructor with args called "+s);
	}

	ConstructorWithThis(){
		this("hello world");
		System.out.println("Constructor with no args call next contructor");
	}


	public static void main (String [] args)
	{
		/* code */
		ConstructorWithThis mConstructorWithThis = new ConstructorWithThis();
	}
}
