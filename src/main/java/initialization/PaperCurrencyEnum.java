package initialization;

import java.util.*;

enum Memony {
	ONE,TWO,THREE,FOUR,FIVE,SIX
}

public class PaperCurrencyEnum {
	public static void main (String [] args)
	{
		/* code */
		for(Memony m : Memony.values()){
			System.out.println(m + " , ordinal " + m.ordinal());
		}
	}
}
