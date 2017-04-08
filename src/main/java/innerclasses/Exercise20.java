package innerclasses;

import java.util.*;

public interface Exercise20{
	void PrintHello();

	class StaticInnerClass implements Exercise20 {
		public void PrintHello(){
			System.out.println("hello , i am StaticInnerClass");
		}

		public static void main (String [] args){
			/* code */
			new StaticInnerClass().PrintHello();
		}
	}
}
