package interfaces;

import java.util.*;

interface Cycle {
	void go();
}

class Unicycle implements Cycle {
	public void go(){
		System.out.println("Unicycle go ");
	}
}

class Bicycle implements Cycle {
	public void go(){
		System.out.println("Bicycle go ");
	}
}

class Tricycle implements Cycle {
	public void go(){
		System.out.println("Tricycle go ");
	}
}

interface Factory {
	Cycle get_cycle();
}

class FactoryUnicycle implements Factory{
	public Cycle get_cycle(){
		return new Unicycle();
	}
}

class FactoryBicycle implements Factory{
	public Cycle get_cycle(){
		return new Bicycle();
	}
}

class FactoryTricycle implements Factory{
	public Cycle get_cycle(){
		return new Tricycle();
	}
}

class Factories {
	public static void cycle_go(Factory f){
		Cycle c = f.get_cycle();
		c.go();
	}
}

public class Exercise18 {
	public static void main (String [] args)
	{
		/* code */
		Factories.cycle_go(new FactoryUnicycle());
		Factories.cycle_go(new FactoryBicycle());
		Factories.cycle_go(new FactoryTricycle());
	}
}

