package innerclasses;

import java.util.*;

public class Exercise18 {
	static class InnerClass{
		public void hello(){
			System.out.println("hello world !");
		}
	}

	public static void main (String [] args)
	{
		/* code */
		//Exercise18.InnerClass mI = new InnerClass();
		InnerClass mI = new InnerClass();
		mI.hello();
	}
}
