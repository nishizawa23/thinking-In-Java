//: innerclasses/Sequence.java
package generics; /* Added by Eclipse.py */

import java.util.*;
// Holds a sequence of Objects.

interface Selector {
        boolean end();
        Object current();
        void next();
        Object [] getSequence();
}

public class Exercise4 <T>{
        private Object[] items;
        private ArrayList <T>mList;
        private int next = 0;
        private static final int MAX_NUM = 10;
//  public Sequence(int size) { items = new Object[size]; }
        public Exercise4() {
                mList = new ArrayList<T>();
        }
        public void add(T x) {
//    if(next < items.length)
//      items[next++] = x;
                if (mList.size() <= 10)
                        mList.add(x);
                else
                        throw new ArrayIndexOutOfBoundsException();
        }
        private class SequenceSelector implements Selector {
                private int i = 0;
                public boolean end() {
                        return i == mList.size();
                }
                public T current() {
                        return mList.get(i);
                }
                public void next() {
                        if (i < mList.size()) i++;
                }
                public Object [] getSequence() {
                        return mList.toArray();
                }
        }

        private class ReverseSelector implements Selector {
                private int i = items.length - 1;
                public boolean end() {
                        return i == -1;
                }
                public Object current() {
                        return items[i];
                }
                public void next() {
                        if (i >= 0 ) i--;
                }
                public Object [] getSequence() {
                        return items;
                }
        }

        public Iterator<T> selector() {
//    return new SequenceSelector();
                return mList.iterator();
        }

        public Selector reverseSelector() {
                return new ReverseSelector();
        }
        public static void main(String[] args) {
                Exercise4<String> sequence = new Exercise4<String>();
                //ArrayList <Sequence> mList = new ArrayList<Sequence>();
                for (int i = 0; i < 10; i++)
                        sequence.add(Integer.toString(i));
//    Selector selector = sequence.selector();
                Iterator<String> mS = sequence.selector();
                /*
                    while(!selector.end()) {
                      System.out.print(selector.current() + " ");
                      selector.next();
                    }
                */
                while (mS.hasNext()) {
                        System.out.println(mS.next());
                }
                /*
                    Selector reverseSelector = sequence.reverseSelector();
                    while(!reverseSelector.end()) {
                      System.out.print(reverseSelector.current() + " ");
                      reverseSelector.next();
                    }
                */

                System.out.println();
                /*
                    Object [] mSS = selector.getSequence();
                        for(int j = 0; j < mSS.length; j++){
                                System.out.println(mSS[j]);
                        }
                */
        }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
