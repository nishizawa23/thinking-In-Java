package polymorphism;

import java.util.*;

class Unicycle extends Cyele {
	public void go(){
		System.out.println("Unicycle go");
	}
}

class Bicycle extends Cyele {
	public void go(){
		System.out.println("Bicycle go");
	}
}

class Tricycle extends Cyele {
	public void go(){
		System.out.println("Tricycle go");
	}
}

public class Cyele {

	public static void ride(Cyele c){
		c.go();
	}

	public void go(){
		System.out.println("Cycle go");
	}

	public static void main (String [] args)
	{
		/* code */
		Cyele [] mClist = {new Unicycle(),new Bicycle(),new Tricycle()};
		for(Cyele c:mClist){
			ride(c);
		}
	}
}
