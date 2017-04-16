//: reusing/Cartoon.java
package reusing; /* Added by Eclipse.py */
// Constructor calls during inheritance.
import static net.mindview.util.Print.*;

class base {
  base(){ print("base constructor");}
}

class Art extends base {
  Art() { print("Art constructor"); }
}

class Drawing extends Art {
  Drawing() { print("Drawing constructor"); }
}

public class Cartoon extends Drawing {
//  Delete Cartoon's construction but base class construction can called by default
//  public Cartoon() { print("Cartoon constructor"); }
  public static void main(String[] args) {
    Cartoon x = new Cartoon();
  }
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
