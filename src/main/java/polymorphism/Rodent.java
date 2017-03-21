package polymorphism;

import java.util.*;

class Mouse extends Rodent {

	public void hello(){
		System.out.println("Mouse hello");
	}
}

class Gerbil extends Rodent {
	
	public void hello(){
		System.out.println("Gerbil hello");
	}
}

class Hamster extends Rodent {

	public void hello(){
		System.out.println("Hamster hello");
	}
}

class RodentFactory {

	private RodentFactory(){
	}

	static public RodentFactory mRF = new RodentFactory();

	static public RodentFactory getFactory(){
		return mRF;
	}

	public Rodent getRodent(int i){
		switch (i) {
			case 0:
				System.out.println("return Mouse");
				return new Mouse();
			case 1:
				System.out.println("return Gerbli");
				return new Gerbil();
			case 2:
				System.out.println("return Hamster");
				return new Hamster();
			default:
				System.out.println("return null");
				return null;
		}
	}
}

public class Rodent {

	public void hello(){
		System.out.println("Rodent hello");
	}

	public static void main (String [] args)
	{
		/* code */
		RodentFactory mRF = RodentFactory.getFactory();

		Rodent [] mRodentList = new Rodent[3];

		for(int i = 0; i < mRodentList.length; i++){
			mRodentList[i] = mRF.getRodent(i);
		}

		for(Rodent r : mRodentList)
			r.hello();
	}
}
