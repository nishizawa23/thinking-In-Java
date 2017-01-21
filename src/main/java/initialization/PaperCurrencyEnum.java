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

		new PaperCurrencyEnum().testEnum(Memony.TWO);
	}

	private void testEnum(Memony m){
		switch (m) {
			case ONE:
				System.out.println(m + " , ordinal " + m.ordinal());
				break;
			case TWO:
				System.out.println(m + " , ordinal " + m.ordinal());
				break;
			case THREE:
				System.out.println(m + " , ordinal " + m.ordinal());
				break;
			case FOUR:
				System.out.println(m + " , ordinal " + m.ordinal());
				break;
			case FIVE:
				System.out.println(m + " , ordinal " + m.ordinal());
				break;
			case SIX:
				System.out.println(m + " , ordinal " + m.ordinal());
				break;
			default:
				System.out.println("at default");
		}
	}
}
