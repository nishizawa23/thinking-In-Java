public class DataOnly {
	int i;
	double d;
	boolean b;

	public DataOnly(){
		i=47;
		d=2.3;
		b=false;
	}

	public static void main (String [] args)
	{
		/* code */
		DataOnly mDataOnly = new DataOnly();
		System.out.println("DataOnly i : " +mDataOnly.i+" d : " +mDataOnly.d+" b : " +mDataOnly.b);
	}
}
