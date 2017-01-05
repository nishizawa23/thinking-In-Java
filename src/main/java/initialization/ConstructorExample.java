package initialization;

import java.util.*;

public class ConstructorExample {

	ConstructorExample(){
		System.out.println("ConstructorExample constructor");
	}

	ConstructorExample(String s){
		System.out.println("ConstructorExample constructor String " + s);
	}
	public static void main (String [] args)
	{
		/* code */
		ConstructorExample mClass = new ConstructorExample();
		ConstructorExample mClassString = new ConstructorExample("hello");
	}
}
