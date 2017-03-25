package interfaces;

import java.util.*;
import interfaces.own.BaseInterfaces;

class Exercise5 implements BaseInterfaces {

	public void mothed_1(){
		System.out.println("hello methed_1");
	}

	public void mothed_2(){
		System.out.println("hello methed_2");
	}

	public void mothed_3(){
		System.out.println("hello methed_3");
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise5 mE = new Exercise5();
		mE.mothed_1();
		mE.mothed_2();
		mE.mothed_3();
	}
}
