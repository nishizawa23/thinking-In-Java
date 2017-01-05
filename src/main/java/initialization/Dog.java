package initialization;

import java.util.*;

public class Dog {

	public void bark(char c){
		System.out.println("Overload bark method char " + (char)c);
	}

	public void bark(int i){
		System.out.println("Overload bark method integer" + i);
	}

	public static void main (String [] args)
	{
		/* code */
		Dog mDog = new Dog();
		mDog.bark('h');
		mDog.bark(88);
	}
}
