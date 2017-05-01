package holding;

import java.util.*;
import net.mindview.util.*;

public class Exercise26 {

	public static void showOrder(Map<String,ArrayList<Integer>> mMap){
		int order = 0;
		LinkedList<String> mLinkList = new LinkedList<String>();
		Set<Map.Entry<String,ArrayList<Integer>>> mSet = mMap.entrySet();
		for(int i = 0; i< mMap.size();i++){
			for(Map.Entry<String,ArrayList<Integer>> mMapEntry : mSet){
				ArrayList<Integer> mA = mMapEntry.getValue();
				for(Integer n : mA){
					if(n.equals(order)){
						mLinkList.add(mMapEntry.getKey());
						order++;
						break;
					}
				}
			}
		}
		System.out.println(mLinkList);
	}

	public static void main(String[] args) {
		ArrayList<String> mStrings = new TextFile("holding/UniqueWords.java","\\W+");
		System.out.println(mStrings);
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
		/* System.out.println(mMap); */

		ArrayList<String> mArrayOrder = new ArrayList<String>();
		showOrder(mMap);
	}
}
