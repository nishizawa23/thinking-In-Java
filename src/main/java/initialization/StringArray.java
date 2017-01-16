package initialization;

import java.util.*;

public class StringArray {

	static String mStrings = "Create an array of String objects and assign a String to each element";
	public static void main (String [] args)
	{
		/* code */
		String [] mStringSplit = mStrings.split(" ");
		for(String word : mStringSplit)
			System.out.println(" word : " + word);
	}
}
