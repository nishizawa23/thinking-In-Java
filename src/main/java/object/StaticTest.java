public class StaticTest{
	static int i = 47;

	static void increment(){
		StaticTest.i++;
	}

	public static void main (String [] args)
	{
		/* code */
		StaticTest.increment();
		System.out.println("Run static method increment() : " + StaticTest.i);

		StaticTest mST1 = new StaticTest();
		StaticTest mST2 = new StaticTest();

		mST1.i = 99;
		System.out.println("mST1.i is " + mST1.i);
		System.out.println("mST2.i is " + mST2.i);
		mST1.i = 1000;
		System.out.println("mST1.i is " + mST1.i);
		System.out.println("mST2.i is " + mST2.i);
	}
}
