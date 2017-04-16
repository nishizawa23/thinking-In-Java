package polymorphism;

import java.util.*;

class Mouse implements Rodent {

	private int refcount = 0;

	private static int Share_id  = 0;
	public int id = Share_id++;

	public void addRef(){
		refcount++;
	}

	public void dispose(){
		if(--refcount == 0)
			System.out.println("Mouse dispose");
	}

	int i = initFM();

	public int initFM(){
		System.out.println("Mouse int i init");
		return 0;
	}

	Mouse(){
		System.out.println("Mouse construction");
	}

	public void hello(){
		System.out.println("Mouse hello");
	}
}

class Gerbil implements Rodent {
	

	Gerbil(){
		System.out.println("Gerbil construction");
	}

	public void hello(){
		System.out.println("Gerbil hello");
	}
}

class Hamster implements Rodent {


	Hamster(){
		System.out.println("Hamster construction");
	}

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

interface Rodent {
/*
	int i = initF();


	public int initF(){
		System.out.println("Rodent int i init");
		return 0;
	}

	Rodent(){
		System.out.println("Rodent construction");
	}
*/
	void hello();

	public static void main (String [] args)
	{
		/* code */
		RodentFactory mRF = RodentFactory.getFactory();

//		Rodent [] mRodentList = new Rodent[3];
		ArrayList<Rodent> mRodentList = new ArrayList<Rodent>();
/*
		for(int i = 0; i < mRodentList.length; i++){
			mRodentList[i] = mRF.getRodent(i);
		}
*/

		for(int i = 0; i < 3; i++){
			mRodentList.add(mRF.getRodent(i));
		}
/*
		for(Rodent r : mRodentList)
			r.hello();
*/
		Iterator<Rodent> mR = mRodentList.iterator();
		while(mR.hasNext())
			mR.next().hello();

		Mouse mMouse = new Mouse();
		mMouse.addRef();
		mMouse.dispose();
	}
}
