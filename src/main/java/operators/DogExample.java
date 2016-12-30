package operators;

import java.util.*;

class Dog {
	String name;
	String says;
	public Dog(String name,String says){
		this.name = name;
		this.says = says;
	}
}

public class DogExample {

	public static void main (String [] args)
	{
		/* code */
		Dog spot = new Dog("spot","Ruff");
		Dog scruffy = new Dog("scruffy","Wuff");
		
		System.out.println("Dog is " + spot.name + " says " + spot.says);
		System.out.println("Dog is " + scruffy.name + " says " + scruffy.says);
	}

}
