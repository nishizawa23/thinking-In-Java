package holding;

import java.util.*;

class Number {
	static public String[] getString(){
		return new String[]{"a","b","c","d","e","f","g","o"};
	}
	
}

public class Exercise7{
	public static void main(String[] args) {
		List<String> mStringList = new ArrayList<String>(Arrays.asList(Number.getString()));
		System.out.println(mStringList);
		
		List<String> mStringListSub = mStringList.subList(1,3);
		System.out.println(mStringListSub);
		System.out.println(mStringList.removeAll(mStringListSub));
		
		List<String> mStringListSub1 = Arrays.asList(mStringList.get(1),mStringList.get(3));		
		System.out.println(mStringListSub1);
		System.out.println(mStringList.removeAll(mStringListSub1));
	}
}
