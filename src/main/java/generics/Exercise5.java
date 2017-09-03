//: generics/Fibonacci.java
package generics; /* Added by Eclipse.py */
// Generate a Fibonacci sequence.
import net.mindview.util.*;
import java.util.*;

public class Exercise5 implements Generator<Integer> {
  private int count = 0;
  private int size;
  public Integer next() { return fib(count++); }
  private int fib(int n) {
    if(n < 2) return 1;
    return fib(n-2) + fib(n-1);
  }

  public class FibonacciItertor implements Iterator<Integer> {
          int count = size;

          public boolean hasNext(){
                  return count > 0;
          }
          public Integer next(){
                  count--;
                  return Exercise5.this.next();
          }
  }

  public Exercise5(){}
  public Exercise5(int size){
          this.size = size;
  }
  public static void main(String[] args) {
    Exercise5 gen = new Exercise5();
    for(int i = 0; i < 18; i++)
      System.out.print(gen.next() + " ");

    gen = new Exercise5(10);
    FibonacciItertor filI = gen.new FibonacciItertor();
    while(filI.hasNext())
      System.out.print("hello " + filI.next() + "\n" );
  }
} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~
