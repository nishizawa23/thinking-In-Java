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
	}
}
