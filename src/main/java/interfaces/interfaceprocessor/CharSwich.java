package interfaces.interfaceprocessor;

public abstract class CharSwich {

	String name;

	CharSwich(String name){
		this.name = name;
	}

	public String name(){
		return this.name;
	}

	public abstract String process(String s);
}

class CharSwichHello extends CharSwich {

	CharSwichHello(String s){
		super(s);
	}

	public String process(String s){
		return "hello " + name + " " + s;
	}
}

class CharSwichWorld extends CharSwich {

	CharSwichWorld(String s){
		super(s);
	}
	public String process(String s){
		return name + " world " + s;
	}
}
