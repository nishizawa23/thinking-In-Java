package holding;

import java.util.*;

public class Exercise19 {
	public static void main(String[] args) {

		HashSet<Integer> mHashSet = new HashSet<Integer>();
		mHashSet.add(1);
		mHashSet.add(2);
		mHashSet.add(3);
		mHashSet.add(4);
		mHashSet.add(5);
        System.out.println(mHashSet);
        // extract to ArrayList
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(mHashSet);
        // sort ArrayList
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer entry1, Integer entry2) {
                return Integer.compare(entry1, entry2);
            }
        });
		System.out.println(list);

		LinkedHashSet<Integer> mLinked = new LinkedHashSet<Integer>(list);
        // print LinkedHashMap
        System.out.println(mLinked);
    }
} 
