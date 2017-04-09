//: innerclasses/Sequence.java
package innerclasses; /* Added by Eclipse.py */

import java.util.*;
// Holds a sequence of Objects.

interface Selector {
  boolean end();
  Object current();
  void next();
  Object [] getSequence();
}	

public class Sequence {
  private Object[] items;
  private ArrayList <String>mList;
  private int next = 0;
//  public Sequence(int size) { items = new Object[size]; }
  public Sequence() { mList = new ArrayList<String>(); }
  public void add(Object x) {
//    if(next < items.length)
//      items[next++] = x;
		mList.add((String)x);
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == mList.size(); }
    public String current() { return mList.get(i); }
    public void next() { if(i < mList.size()) i++; }
	public Object [] getSequence(){
		return mList.toArray();
	}
  }

  private class ReverseSelector implements Selector {
    private int i = items.length -1;
    public boolean end() { return i == -1; }
    public Object current() { return items[i]; }
    public void next() { if(i >= 0 ) i--; }
	public Object [] getSequence(){
		return items;
	}
  }

  public Selector selector() {
    return new SequenceSelector();
  }	

  public Selector reverseSelector() {
    return new ReverseSelector();
  }	
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    //ArrayList <Sequence> mList = new ArrayList<Sequence>();
    for(int i = 0; i < 20; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();

    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
/*
    Selector reverseSelector = sequence.reverseSelector();
    while(!reverseSelector.end()) {
      System.out.print(reverseSelector.current() + " ");
      reverseSelector.next();
    }
*/

	System.out.println();

    Object [] mSS = selector.getSequence();
	for(int j = 0; j < mSS.length; j++){
		System.out.println(mSS[j]);
	}
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
