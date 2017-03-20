package polymorphism;

import java.util.*;

class Unicycle extends Cyele {
	public int wheels(){
		return 1;
	}
	public void go(){
		System.out.println("Unicycle go");
	}
}

class Bicycle extends Cyele {
	public int wheels(){
		return 2;
	}
	public void go(){
		System.out.println("Bicycle go");
	}
}

class Tricycle extends Cyele {
	public int wheels(){
		return 3;
	}
	public void go(){
		System.out.println("Tricycle go");
	}
}

public class Cyele {

	public int wheels(){
		return 0;
	}

	public static void ride(Cyele c){
		c.go();
		System.out.println("go for " + c.wheels() + " wheels");
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
