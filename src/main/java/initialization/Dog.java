package initialization;

import java.util.*;

public class Dog {

	public void bark(char c, int i){
		System.out.println("Overload bark method char " + 
			(char)c + "int " + i);
	}

	public void bark(int i, char c){
		System.out.println("Overload bark method integer" + 
			i + " char " + (char)c);
	}

	public static void main (String [] args)
	{
		/* code */
		Dog mDog = new Dog();
		mDog.bark('h',100);
		mDog.bark(88,'c');
	}
}
