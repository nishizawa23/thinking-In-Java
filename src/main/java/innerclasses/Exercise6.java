package innerclasses;

import innerclasses.hello.Hello;
import innerclasses.hello.world.HelloInterface;

public class Exercise6 extends Hello{
	public static void main (String [] args)
	{
		/* code */
		Exercise6 mE6 = new Exercise6();
		HelloInterface mHelloInner = mE6.getHelloInterface();
		mHelloInner.hello();
	}
}
