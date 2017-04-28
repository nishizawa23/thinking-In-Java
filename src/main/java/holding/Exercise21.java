package holding;

import java.util.*;
import net.mindview.util.*;

public class Exercise21 {

	static HashMap<String,Integer> mHashMap;

	public static void main (String [] args)
	{
		/* code */
		ArrayList<String> mStrings = new TextFile("holding/UniqueWords.java","\\W+");

		mHashMap = new HashMap<String,Integer>();

		Iterator<String> mIterator = mStrings.iterator();

		while(mIterator.hasNext()){
			String mWord = mIterator.next();
			Integer mTimes = mHashMap.get(mWord);
			mHashMap.put(mWord,mTimes==null?1:mTimes+1);
		}

		Collection mCollection = mHashMap.keySet();
		List<String> mList = new ArrayList<String>(mHashMap.keySet());

		System.out.println(mList);
		Collections.sort(mList,String.CASE_INSENSITIVE_ORDER);
		System.out.println(mList);
		
	}
}
