package access;

import java.util.*;

public class Exercise5 {

	public int mFiled1 = 1;
	protected int mFiled2 = 2;
	private int mFiled3 = 3;
	int mFiled4 = 4;

	public void mMetho1(){
		System.out.println("heloo mMetho1");
	}
	
	protected void mMetho2(){
		System.out.println("heloo mMetho2");
	}

	private void mMetho3(){
		System.out.println("heloo mMetho3");
	}

	void mMetho4(){
		System.out.println("heloo mMetho4");
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise5 mObject = new Exercise5();
		mObject.mFiled1 = 0;
		mObject.mFiled2 = 0;
		mObject.mFiled3 = 0;
		mObject.mFiled4 = 0;

		System.out.println("mFiled1 " + mObject.mFiled1 + 
			" mFiled2 " + mObject.mFiled2 + 
			" mFiled3 " + mObject.mFiled3 + 
			" mFiled4 " + mObject.mFiled4);

		mObject.mMetho1();
		mObject.mMetho2();
		mObject.mMetho3();
		mObject.mMetho4();
	}
}
