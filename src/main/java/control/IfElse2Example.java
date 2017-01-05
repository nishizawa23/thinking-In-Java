//: control/IfElse2.java
package control; /* Added by Eclipse.py */
import static net.mindview.util.Print.*;

public class IfElse2Example {
  static boolean test(int testval, int begin, int end) {
	return (testval<=end && testval>= begin)?true:false;
  }
  public static void main(String[] args) {
    print(test(10, 5, 9));
    print(test(5, 10, 12));
    print(test(8, 5, 8));
  }
} /* Output:
1
-1
0
*///:~
