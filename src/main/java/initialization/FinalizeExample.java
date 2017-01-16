package initialization;

import java.util.*;

class Book{

	String bookname = "hello world";

// this is not sure to call, try more times!!
	protected void finalize() {
		System.out.println("book class called finalize()");
	}
}

public class FinalizeExample {
	public static void main (String [] args)
	{
		/* code */
		//FinalizeExample mFinalize = new FinalizeExample();
		new FinalizeExample();
		//Book mBook = new Book();
		new Book();
		// even if call System.gc(),not do finalize() every time
		System.gc();
	}
// this is not sure to call, try more times!!
	protected void finalize(){
		System.out.println("finalizeExample class call finalize()");
	}
}
