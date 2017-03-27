package interfaces;

import java.util.*;
import java.nio.*;

class Exercise16 implements Readable {

	private static final char[] mCharArray = "ABCDEFGabcdefg".toCharArray();
	private int count = 0;

	Exercise16(int n){
		this.count = n;
	}

	public int read(CharBuffer cb){
		if(count--  == 0)
			return -1;
		int i = 0;
		for(; i < count ; i++)
			cb.append(mCharArray[--count]);
		return i;
	}

	public static void main (String [] args)
	{
		/* code */
		Scanner s = new Scanner(new Exercise16(14));
		while(s.hasNext())
			System.out.println(s.next());
	}
}
