package interfaces;

import java.util.*;

abstract class Base{
}


class Exercise4 extends Base{

	static public Base getBaseReference(){
		return new Exercise4();
	}

	public void hello(){
		System.out.println("hello world");
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise4 mE = (Exercise4)Exercise4.getBaseReference();
		mE.hello();
	}
}
