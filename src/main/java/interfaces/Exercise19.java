package interfaces;

import java.util.*;

interface Tossing{
	void go();
}

class CoinTossing implements Tossing{
	public void go(){
		System.out.println("CoinTossing go");
	}
}

class DiceTossing implements Tossing{
	public void go(){
		System.out.println("DiceTossing go");
	}
} 

interface Factory{
		Tossing getTossing();
}

class CoinFactory implements Factory{
	public Tossing getTossing(){
		return new CoinTossing();
	}
} 

class DiceFactory implements Factory{
	public Tossing getTossing(){
		return new DiceTossing();
	}
}

class Factories {
	public static void goTossing(Factory f){
		Tossing t = f.getTossing();
		t.go();
	}
}

class Exercise19 {
	public static void main (String [] args)
	{
		/* code */
		Factories.goTossing(new CoinFactory());
		Factories.goTossing(new DiceFactory());
	}
}
