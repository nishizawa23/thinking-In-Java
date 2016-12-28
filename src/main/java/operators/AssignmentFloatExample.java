package operators;

import static net.mindview.util.Print.*;

class Tank {
	float i;
}

public class AssignmentFloatExample {
	public static void main (String [] args)
	{
		/* code */
		Tank tank1 = new Tank();
		Tank tank2 = new Tank();

		tank1.i = 43;
		tank2.i = 47;

		print("1 : tank1.i: " + tank1.i + 
			" tank2.i: " + tank2.i);

		tank1 = tank2;

		print("2 : tank1.i: " + tank1.i + 
			" tank2.i: " + tank2.i);

		tank2.i = 39;

		print("3 : tank1.i: " + tank1.i + 
			" tank2.i: " + tank2.i);
	}
}

