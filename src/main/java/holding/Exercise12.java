package holding;

import java.util.*;

public class Exercise12 {
	public static void main (String [] args)
	{
		/* code */
		List<Integer> mList1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6));
		List<Integer> mList2 = new ArrayList<Integer>();

		ListIterator<Integer> mListIterator = mList1.listIterator(7);
		while(mListIterator.hasPrevious()){
			mList2.add(mListIterator.previous());
		}
		
		System.out.println(mList2);
	}
}
