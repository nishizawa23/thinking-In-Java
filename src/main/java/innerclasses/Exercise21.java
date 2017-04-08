package innerclasses;

import java.util.*;

interface Exercise21 {

	static void print(){};

	class InnerClass implements Exercise21{

		public static void print(){
			System.out.println("hello world");
		}
		static void hello () {
			print();
		}

		public static void main (String [] args)
		{
			/* code */
			new InnerClass().hello();
		}
	}
}
