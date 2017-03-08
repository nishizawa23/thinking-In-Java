package reusing;

public class ExtendsDetergent extends Detergent {
	public void scrub(){
		append(" ExtendsDetergent.scrub()");
		super.scrub();
	}

	public void sterilize(){
		append(" ExtendsDetergent.sterilize()");
	}

	public static void main (String [] args)
	{
		/* code */
		ExtendsDetergent mED = new ExtendsDetergent();
		mED.dilute();
		mED.apply();
		mED.scrub();
		mED.foam();
		mED.sterilize();
		System.out.println(mED);
	}
}
