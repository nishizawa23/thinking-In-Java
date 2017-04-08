//: innerclasses/Sequence.java
package innerclasses; /* Added by Eclipse.py */
// Holds a sequence of Objects.

interface Selector {
  boolean end();
  Object current();
  void next();
  Object [] getSequence();
}	

public class Sequence {
  private Object[] items;
  private int next = 0;
  public Sequence(int size) { items = new Object[size]; }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
	public Object [] getSequence(){
		return items;
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
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();

    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }

    Selector reverseSelector = sequence.reverseSelector();
    while(!reverseSelector.end()) {
      System.out.print(reverseSelector.current() + " ");
      reverseSelector.next();
    }

	System.out.println();

    Object [] mSS = selector.getSequence();
	for(int j = 0; j < 10; j++){
		System.out.println(mSS[j]);
	}
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
