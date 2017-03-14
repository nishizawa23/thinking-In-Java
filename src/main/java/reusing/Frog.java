package reusing;

import java.util.*;

class Amphibian {

	protected void hello (){
		System.out.println("hello world");
	}
}

public class Frog extends Amphibian {

	public static void main (String [] args)
	{
		/* code */
		Amphibian mA = new Frog();
		mA.hello();
	}
}
