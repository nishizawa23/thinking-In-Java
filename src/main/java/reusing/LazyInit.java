package reusing;

import java.util.*;

class SimpleClass {
	public SimpleClass(){
		System.out.println("SimpleClass Construction!");
	}
	public String toString(){
		return	"i am SimpleClass";
	}
}

public class LazyInit {

	private SimpleClass mSC = null;

	private SimpleClass getSimpleClass(){
		if(mSC == null)
			mSC = new SimpleClass();
		return mSC;
	}
	public static void main (String [] args)
	{
		/* code */
		LazyInit mLI = new LazyInit();
		for(int i = 0; i < 5; i++)
			System.out.println(mLI.getSimpleClass());
			
	}
}
