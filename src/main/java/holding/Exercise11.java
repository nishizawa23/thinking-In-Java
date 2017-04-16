package holding;

import java.util.*;

interface Fruit{};

class Apple implements Fruit {
	public String toString(){
		return "i am apple";
	}
}

class Pear implements Fruit {
	public String toString(){
		return "i am pear";
	}
} 

public class Exercise11 {

	public void whichFruit(Collection<Fruit> mC){
		Iterator<Fruit> mF = mC.iterator();
		while(mF.hasNext())
			System.out.println(mF.next());
	}
	public static void main (String [] args)
	{
		/* code */
		Collection<Fruit> mC = new ArrayList<Fruit>();
		Collections.addAll(mC, new Apple(), new Pear());
		new Exercise11().whichFruit(mC);
	}
}
