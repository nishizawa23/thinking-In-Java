public class AutoBoxExample {

	int a;
	float b;
	long c;
	short d;
	boolean e;
	byte f;
	char g;
	double h;

	Integer A;
	Float B;
	Long C;
	Short D;
	Boolean E;
	Byte F;
	Character G;
	Double H;

	public static void main (String [] args)
	{
		/* code */
		AutoBoxExample mAutoBoxExample = new AutoBoxExample();

		mAutoBoxExample.A = new Integer(66);
		mAutoBoxExample.B = new Float(2.333);
		mAutoBoxExample.C = new Long(99999);
		mAutoBoxExample.D = new Short((short)2);
		mAutoBoxExample.E = new Boolean(true);
		mAutoBoxExample.F = new Byte((byte)0xf0);
		mAutoBoxExample.G = new Character('a');
		mAutoBoxExample.H = new Double(3.55555);

		mAutoBoxExample.a = mAutoBoxExample.A;
		mAutoBoxExample.b = mAutoBoxExample.B;
		mAutoBoxExample.c = mAutoBoxExample.C;
		mAutoBoxExample.d = mAutoBoxExample.D;
		mAutoBoxExample.e = mAutoBoxExample.E;
		mAutoBoxExample.f = mAutoBoxExample.F;
		mAutoBoxExample.g = mAutoBoxExample.G;
		mAutoBoxExample.h = mAutoBoxExample.H;

		System.out.println("a " + mAutoBoxExample.a + 
			" b " + mAutoBoxExample.b +
			" c " + mAutoBoxExample.c +
			" d " + mAutoBoxExample.d +
			" e " + mAutoBoxExample.e +
			" f " + mAutoBoxExample.f +
			" g " + mAutoBoxExample.g +
			" h " + mAutoBoxExample.h);
	}
}
