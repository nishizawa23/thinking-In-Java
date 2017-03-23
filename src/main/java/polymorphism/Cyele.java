package polymorphism;

import java.util.*;

class Unicycle extends Cyele {
	public int wheels(){
		return 1;
	}
	public void go(){
		System.out.println("Unicycle go");
	}
	public void balance(){
		System.out.println("Unicycle balance");
	}
}

class Bicycle extends Cyele {
	public int wheels(){
		return 2;
	}
	public void go(){
		System.out.println("Bicycle go");
	}
	public void balance(){
		System.out.println("Bicycle balance");
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

	public void balance(){
		System.out.println("cycle balance");
	}

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
			c.balance();
		}

		System.out.println(" ");

		((Unicycle)mClist[0]).balance();
		((Bicycle)mClist[1]).balance();
		((Tricycle)mClist[2]).balance();
	}
}
