package reusing;

import java.util.*;

class Root {
	public void One(int i){
		System.out.println("One int from Root class "+i);
	}

	public void One(float i){
		System.out.println("One float from Root class "+i);
	}

	public void One(String i){
		System.out.println("One String from Root class "+i);
	}
}

public class Execise13 extends Root {

	public void One(double i){
		System.out.println("One String from Execise13 class "+i);
	}

	public static void main (String [] args)
	{
		/* code */
		Execise13 mE = new Execise13();
		mE.One(1);
		mE.One(0.1f);
		mE.One("hello ");
		//mE.One((double)0.2);
		mE.One(0.2d);
	}
}
