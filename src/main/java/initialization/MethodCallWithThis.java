package initialization;

import java.util.*;

public class MethodCallWithThis {

	public void methodOne(){
		System.out.println("on methodOne ");
		System.out.println("call methodTwo without this  ");
		methodTwo();
		System.out.println("call methodTwo with this  ");
		this.methodTwo();
	}
	public void methodTwo(){
		System.out.println("methodTwo called");
	}

	public static void main (String [] args)
	{
		/* code */
		MethodCallWithThis mMethodCallWithThis = new MethodCallWithThis();
		mMethodCallWithThis.methodOne();
	}
}
