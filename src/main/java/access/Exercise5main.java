package access;

import java.util.*;

public class Exercise5main {
	public static void main (String [] args)
	{
		/* code */
		Exercise5 mObject = new Exercise5();
        mObject.mFiled1 = 0;
        mObject.mFiled2 = 0;
//      mObject.mFiled3 = 0;  // can not access private field
        mObject.mFiled4 = 0;

        System.out.println("mFiled1 " + mObject.mFiled1 +
            " mFiled2 " + mObject.mFiled2 +
//          " mFiled3 " + mObject.mFiled3 +  // can not access private field
            " mFiled4 " + mObject.mFiled4);

        mObject.mMetho1();
        mObject.mMetho2();
//      mObject.mMetho3(); // can not access private metho
        mObject.mMetho4();
	}
}
