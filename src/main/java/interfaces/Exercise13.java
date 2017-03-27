package interfaces;

interface Three extends Two,One{
	void three();
}

interface Two {
	void two();
}

interface One {
	void one();
}

class Exercise13 implements Three,Two,One {

	public void one(){
		System.out.println("one");
	}

	public void two(){
		System.out.println("two");
	}

	public void three(){
		System.out.println("three");
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise13 mE = new Exercise13();
		mE.one();
		mE.two();
		mE.three();
	}
}
