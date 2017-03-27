package interfaces;

interface One {
	void one_1();
	void one_2();
}

interface Two {
	void two_1();
	void two_2();
}

interface Three {
	void three_1();
	void three_2();
}

abstract class Four implements One,Two,Three{
	abstract void four();
}

class ShowInterface {
	public static void one_1(One o){
		o.one_1();
	}

	public static void one_2(One o){
		o.one_2();
	}

	public static void two_1(Two o){
		o.two_1();
	}

	public static void two_2(Two o){
		o.two_2();
	}

	public static void three_1(Three o){
		o.three_1();
	}

	public static void three_2(Three o){
		o.three_2();
	}

	public static void four(Four o){
		o.four();
	}
}

public class Exercise14 extends Four implements One,Two,Three{

	public void one_1(){
		System.out.println("one_1");
	}

	public void one_2(){
		System.out.println("one_2");
	}

	public void two_1(){
		System.out.println("two_1");
	}

	public void two_2(){
		System.out.println("two_2");
	}

	public void three_1(){
		System.out.println("three_1");
	}

	public void three_2(){
		System.out.println("three_2");
	}

	public void four(){
		System.out.println("four");
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise14 mE = new Exercise14();
		ShowInterface.one_1(mE);
		ShowInterface.one_2(mE);
		ShowInterface.two_1(mE);
		ShowInterface.two_2(mE);
		ShowInterface.three_1(mE);
		ShowInterface.three_2(mE);
		ShowInterface.four(mE);
	}
}
