package holding;

import java.util.*;
import net.mindview.util.*;

class Word {
	String name = null;
	int number = 0;	

	public String getName(){
		return this.name;
	}

	public int getNumber(){
		return this.number;
	}

	public void setNumber(){
		this.number++;
	}

	public Word(String word){
		name = word;
	}

	public String toString(){
		return " name "+name+" number "+number;
	}
	@Override
        public boolean equals(Object o) {
             Word p = (Word)o;
             return this.name.equals(p.getName());
        }
        @Override
        public int hashCode() {
	     return this.name.hashCode();
	}
}

public class Exercise22 {


	public static void main (String [] args)
	{
		/* code */
		ArrayList<String> mStrings = new TextFile("holding/UniqueWords.java","\\W+");

		HashSet<Word> mHashSet = new HashSet<Word>();

		Iterator<String> mIterator = mStrings.iterator();

		while(mIterator.hasNext()){
			String mString = mIterator.next();
			Word mWord = new Word(mString);
			if(mHashSet.contains(mWord)){
			//	System.out.println("word "+mWord);
				Iterator<Word> mI = mHashSet.iterator();
				while(mI.hasNext()){
					Word w = mI.next();
					if(w.getName().equals(mWord.getName()))
						w.setNumber();
				}
			}else{
				mWord.setNumber();
				mHashSet.add(mWord);
			}
		}
		System.out.println(mHashSet);
	}
}
