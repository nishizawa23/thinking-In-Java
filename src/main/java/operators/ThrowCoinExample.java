package operators;

import java.util.*;

public class ThrowCoinExample {

	public static void main (String [] args)
	{
		/* code */
		Random coinRandom = new Random();
		for(int i = 0; i < 10; i++){
			System.out.println("coin side is " + coinRandom.nextBoolean());
		}
	}
}
