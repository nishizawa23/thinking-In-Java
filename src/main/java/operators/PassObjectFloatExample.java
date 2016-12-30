package operators;

import java.util.*;
import static net.mindview.util.Print.*;

class TestFloat {
	float f;
}

public class PassObjectFloatExample {

	static void f(TestFloat x){
		x.f = 8.000f;
	}

	public static void main (String [] args)
	{
		/* code */
		TestFloat a = new TestFloat();
		a.f = 6.000f;
		print("1: a.f: " + a.f);
		f(a);
		print("2: a.f: " + a.f);
	}
}
