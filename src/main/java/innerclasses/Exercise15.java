package innerclasses;

import java.util.*;

class One {
	public One(int i){
		System.out.println("One class construction " + i);
	}

	public void Print(){
		System.out.println("i am One");
	}
}

public class Exercise15 {

	public One getOne(int i){
		return new One(i){
			public void Print(){
				System.out.println("i am Two");
			}
		};
	}

	public static void main (String [] args)
	{
		/* code */
		One mOne = new Exercise15().getOne(9);
		mOne.Print();
	}
}
