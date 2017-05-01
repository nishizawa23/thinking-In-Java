package holding;

import java.util.*;
import net.mindview.util.*;

public class Exercise25 {
	public static void main(String[] args) {
		ArrayList<String> mStrings = new TextFile("holding/UniqueWords.java","\\W+");
		Map<String,ArrayList<Integer>> mMap = new HashMap<String,ArrayList<Integer>>();
		int mLocation = 0;
		Iterator<String> mI = mStrings.iterator();
		while(mI.hasNext()){
			String mWord = mI.next();
			ArrayList<Integer> mA = mMap.get(mWord);
			if(mA == null){
				mA = new ArrayList<Integer>(Arrays.asList(mLocation));
			}else
				mA.add(mLocation);
			mMap.put(mWord,mA);
			mLocation++;
		}
		System.out.println(mMap);
	}
}
