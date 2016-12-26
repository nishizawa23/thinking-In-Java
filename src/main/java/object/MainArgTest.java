public class MainArgTest {

	public static void main (String [] args)
	{
		/* code */
		int mArgNumber = args.length;
		for(int i=0;i<mArgNumber;i++){
			System.out.println("args["+i+"] " + args[i]);
		}
	}
}
