package operators;

import java.util.*;

import static net.mindview.util.Print.*;

public class Speed {

	static double f( double d, double t){
		return d/t;
	}

	public static void main (String [] args)
	{
		/* code */
		double distants = 1000.33;
		double time = 30.1;
		double speed;

		speed = f(distants,time);
		print("1 distants : " + distants + " time : " + time + " speed "  + speed);
	}
}
