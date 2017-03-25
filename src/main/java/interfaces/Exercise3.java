package interfaces;

import java.util.*;

abstract class Base {

	Base(){
		print();
	}
	abstract void print();
}

class Exercise3 extends Base {
	int i = 10;
	@Override
	public void print(){
		System.out.println("i = " + i);
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise3 mE = new Exercise3();
		mE.print();
	}

}
