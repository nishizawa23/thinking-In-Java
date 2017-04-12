package holding;

import java.util.*;

class GetNumber {
	private int items = 0;
	private int len = 0;
	private String[] numberlist;

	public GetNumber(){

		numberlist = new String[]{"one","two","three","four","five","six", 
			"seven","eghit","nine","ten"};
		len = numberlist.length;
	}

	public String Next(){
		if(items == 9){
			String m = numberlist[items];
			items = 0;
			return m;
		}else{
			String m = numberlist[items];
			items++;
			return m;
			
		}
	}
}

public class Exercise4 {

	public void printCollection(Collection<String> mCollection,int times,GetNumber mG){
		for(int i = 0; i< times; i++){
			mCollection.add(mG.Next());
		}

		for(String m : mCollection)
			System.out.println(m);
	}

	public static void main (String [] args)
	{
		/* code */
		GetNumber mGN = new GetNumber();

		String []mListNumber = new String[5];
		for(int i = 0; i < 5; i++)
				mListNumber[i] = mGN.Next();
		ArrayList<String> mArrayList = new ArrayList<String>(Arrays.asList(mListNumber));
		for(String mString : mArrayList)
			System.out.println("ArrayList " + mString);

		String[] mLinkedNumber = new String[5];
		for(int i = 0; i < 5; i++)
				mLinkedNumber[i] = mGN.Next();
		LinkedList<String> mLinkedList = new LinkedList<String>(Arrays.asList(mLinkedNumber));
		for(String mString : mLinkedList)
			System.out.println("LinkedList " + mString);

		//use function
		Exercise4 mE4 = new Exercise4();
		System.out.println("\n" + "HashSet " +"\n");
		mE4.printCollection(new HashSet<String>(),20,mGN);

		System.out.println("\n" + "LinkedHashSet " +"\n");
		mE4.printCollection(new LinkedHashSet<String>(),20,mGN);

		System.out.println("\n" + "TreeSet " +"\n");
		mE4.printCollection(new TreeSet<String>(),20,mGN);
	}
}
