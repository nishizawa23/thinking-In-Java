package reusing;

import java.util.*;

public class Exercise18 {

	public static Random mRandom = new Random(47);

	public static final int a = 10;
	public final int b = mRandom.nextInt(22);

	public void showFinal(){
		System.out.println("a : " + a+ " b : " + b);
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise18 mE1 = new Exercise18();
		mE1.showFinal();
		Exercise18 mE2 = new Exercise18();
		mE2.showFinal();
	}
}
