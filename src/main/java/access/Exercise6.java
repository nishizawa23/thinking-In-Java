package access;

import java.util.*;

class TestPC {
	protected String mS = "hello world";
}

public class Exercise6 extends TestPC {

	public void callPC (){
		System.out.println("call TestPC mS " + mS);
	}
	public static void main (String [] args)
	{
		/* code */
		Exercise6 mObject = new Exercise6();
		mObject.callPC();
	}
}
