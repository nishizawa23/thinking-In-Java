package innerclasses;

import java.util.*;

interface Hello {
	void hello();
}

public class Exercise9 {


	public Hello getHelloInterface(){
		class EInner implements Hello {
			public void hello(){
				System.out.println("hello world");
			}
		}
		return new EInner();
	}

	public static void main (String [] args)
	{
		/* code */
		Hello mHello = new Exercise9().getHelloInterface();
		mHello.hello();
	}
}
