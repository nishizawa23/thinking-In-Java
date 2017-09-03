//: generics/RandomList.java
package generics; /* Added by Eclipse.py */
import java.util.*;

class Hello {
        static int a = 0;
        final int b = a++;
        public Hello(){
        }
        public String toString(){
                return "Hello--"+b;
        }
}

public class RandomList<T> {
  private ArrayList<T> storage = new ArrayList<T>();
  private Random rand = new Random(47);
  public void add(T item) { storage.add(item); }
  public T select() {
    return storage.get(rand.nextInt(storage.size()));
  }
  public static void main(String[] args) {
    RandomList<String> rs = new RandomList<String>();
    for(String s: ("The quick brown fox jumped over " +
        "the lazy brown dog").split(" "))
      rs.add(s);
    for(int i = 0; i < 11; i++)
      System.out.print(rs.select() + " ");

    RandomList<Long> rl = new RandomList<Long>();
    RandomList<Hello> rh = new RandomList<Hello>();
    Long l = 100L;
    for(int a = 0; a < 10; a++){
            rh.add(new Hello());
            rl.add(l++);
    }
    for(int b = 0; b < 10; b++){
            System.out.print(rl.select() + " ");
            System.out.print(rh.select() + " ");
    }
  }
} /* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
