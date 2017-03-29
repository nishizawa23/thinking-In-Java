package innerclasses;

import java.util.*;

public class Outer {

	class Inner {
		public void showMessage(){
			System.out.println("hello , i am Inner");
		}
	}

	public Inner getInner(){
		return new Inner();
	}

	public static void main (String [] args)
	{
		/* code */
		Outer.Inner mInner = new Outer().getInner();
		mInner.showMessage();
	}
}
