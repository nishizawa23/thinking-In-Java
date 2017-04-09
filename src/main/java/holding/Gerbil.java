package holding;

import java.util.*;

public class Gerbil {
	private static int counter;
	private final int number = counter++;
	public void hop(){
		System.out.println("jump hop id " + number);
	}

	public static void main (String [] args)
	{
		/* code */
		ArrayList<Gerbil> mGerbilList = new ArrayList<Gerbil>();
		for(int i = 0; i < 10; i++)
			mGerbilList.add(new Gerbil());

		for(int i = 0; i < mGerbilList.size(); i++)
			mGerbilList.get(i).hop();
	}
}
