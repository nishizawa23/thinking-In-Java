package holding;

import java.util.*;
import net.mindview.util.*;

public class Exercise20 {

	static HashMap<Character,Integer> mHashMap;

	public static void InitMapKey(){
		ArrayList<Character> mArrayList = new ArrayList<Character>
										(Arrays.asList('a','e','i','o','u'));
		Iterator<Character> mIterator = mArrayList.iterator();
		while(mIterator.hasNext())
			mHashMap.put(mIterator.next(),0);
	}

	public static void main (String [] args)
	{
		/* code */
		ArrayList<String> mStrings = new TextFile("holding/UniqueWords.java");

		System.out.println(mStrings);

		mHashMap = new HashMap<Character,Integer>();

		InitMapKey();

		Iterator<String> mIterator = mStrings.iterator();

		while(mIterator.hasNext()){
			char[] mChars = mIterator.next().toCharArray();
			for(int i = 0; i < mChars.length; i++){
				if(mHashMap.containsKey(mChars[i])){
					Integer mVal = mHashMap.get(mChars[i]);
					mHashMap.put(mChars[i],mVal+1);
				}
			}
		}

		System.out.println("\n" + mHashMap);
		
	}
}
