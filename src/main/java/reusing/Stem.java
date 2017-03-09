package reusing;

import java.util.*;

class Component1{
	Component1(int i){
		System.out.println("Component1 constructor i "+i);
	}
}

class Component2{
	Component2(int i){
		System.out.println("Component2 constructor i "+i);
	}
}

class Component3{
	Component3(int i){
		System.out.println("Component3 constructor i "+i);
	}
}

class Root {
	Component1 mC1;
	Component2 mC2;
	Component3 mC3;
	Root(int i){
		System.out.println("Root constructor i "+i);
		mC1 = new Component1(i);
		mC2 = new Component2(i);
		mC3 = new Component3(i);
	}
}

public class Stem extends Root {
	Stem(int i){
		super(i);
		System.out.println("Stem constructor i " + i);
		mC1 = new Component1(12);
		mC2 = new Component2(12);
		mC3 = new Component3(12);
	}
	public static void main (String [] args)
	{
		/* code */
		Stem mS = new Stem(11);
	}
}

