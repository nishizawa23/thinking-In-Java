package initialization;

import java.util.*;

class Tank {

	boolean status;

	Tank(boolean status){
		this.status = status;
	}

	void CleanTank(){
		status = false;
	}

	protected void finalize(){
		if(status){
			System.out.println("do not clean for this tank");
		}
	}
}

public class TerminationConditionForTank {
	public static void main (String [] args)
	{
		/* code */
		// new a tank for full
		Tank tank1 = new Tank(true);
		// set empty for tank1
		tank1.CleanTank();

		// new a tank for full but no reference
		new Tank(true);

		System.gc();
	}
}
