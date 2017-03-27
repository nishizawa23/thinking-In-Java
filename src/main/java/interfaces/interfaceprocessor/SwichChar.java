package interfaces.interfaceprocessor;

//import interfaces.filters.*;

class CharAdapter implements Processor {

	CharSwich mCharSwich;

	public CharAdapter(CharSwich c){
		this.mCharSwich = c;
	}

	public String name(){
		return mCharSwich.name();
	}

	public String process(Object input){
		return mCharSwich.process((String)input);
	}
}

public class SwichChar {

	public static void main (String [] args)
	{
		/* code */
		
		Apply.process(new CharAdapter(new CharSwichHello("one")),"aaaa");
		Apply.process(new CharAdapter(new CharSwichWorld("ten")),"bbbb");
	}
}
