//: reusing/Beetle.java
package reusing; /* Added by Eclipse.py */
// The full process of initialization.
import static net.mindview.util.Print.*;

class Insect {
  private int i = 9;
  protected int j;
  Insect() {
    print("i = " + i + ", j = " + j);
    j = 39;
  }
  private static int x1 =
    printInit("static Insect.x1 initialized");
  static int printInit(String s) {
    print(s);
    return 47;
  }
}

class Beetle1 extends Beetle {
  private int k = printInit("Beetle1.k initialized");
  public Beetle1() {
    print("k = " + k);
    print("j = " + j);
  }
  private static int x2 =
    printInit("static Beetle1.x2 initialized");
} 

public class Beetle extends Insect {
  private int k = printInit("Beetle.k initialized");
  public Beetle() {
    print("k = " + k);
    print("j = " + j);
  }
  private static int x2 =
    printInit("static Beetle.x2 initialized");
  public static void main(String[] args) {
    print("Beetle constructor");
    Beetle b = new Beetle();
    Beetle1 b1 = new Beetle1();
  }
} /* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i = 9, j = 0
Beetle.k initialized
k = 47
j = 39
static Beetle1.x2 initialized
i = 9, j = 0
Beetle.k initialized
k = 47
j = 39
Beetle1.k initialized
k = 47
j = 39

*///:~
