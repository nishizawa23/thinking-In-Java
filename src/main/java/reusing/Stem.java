package reusing;

import java.util.*;

class Component1{
	Component1(){
		System.out.println("Component1 constructor");
	}
}

class Component2{
	Component2(){
		System.out.println("Component2 constructor");
	}
}

class Component3{
	Component3(){
		System.out.println("Component3 constructor");
	}
}

class Root {
	Component1 mC1;
	Component2 mC2;
	Component3 mC3;
	Root(){
		System.out.println("Root constructor");
		mC1 = new Component1();
		mC2 = new Component2();
		mC3 = new Component3();
	}
}

public class Stem extends Root {
	Stem(){
		System.out.println("Stem constructor");
		mC1 = new Component1();
		mC2 = new Component2();
		mC3 = new Component3();
	}
	public static void main (String [] args)
	{
		/* code */
		Stem mS = new Stem();
	}
}

