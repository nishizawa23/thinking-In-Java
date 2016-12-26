public class StorageExample {
	public int Storage(String s){
		return s.length()*2;
	}

	public static void main (String [] args)
	{
		/* code */
		String mHello = new String("hello");
		System.out.println("String hello has byte : "+ (new StorageExample()).Storage(mHello));
	}
}
