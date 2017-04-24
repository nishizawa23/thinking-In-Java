package holding;

import java.util.*;
import net.mindview.util.*;

public class Exercise16 {
	public static void main (String [] args)
	{
		/* code */
		ArrayList<String> mString = new TextFile("holding/UniqueWords.java","\\W+");
		Set<Character> mSet = new TreeSet<Character>(Arrays.asList('a','e','i','o','u'));
		System.out.println(mString);
		ListIterator mListIterator = mString.listIterator();
/*
		while(mListIterator.hasNext()){
			
		}
*/
	}
}
