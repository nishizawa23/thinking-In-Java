//: reusing/Detergent.java
package reusing; /* Added by Eclipse.py */
// Inheritance syntax & properties.
import static net.mindview.util.Print.*;

class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    print(x);
  }
}	

public class DetergentTrue {

   Cleanser mCr;

  public DetergentTrue(){
	mCr = new Cleanser();
  }

  public void dilute(){
	mCr.dilute();
  }

  public void apply(){
	mCr.apply();
  }

  public void scrub() {
    mCr.append(" Detergent.scrub()");
    mCr.scrub(); // Call base-class version
  }

  // Add methods to the interface:
  //public void foam() { append(" foam()"); }
  public void foam() {
	mCr.append(" foam()");
  }
  public String toString() { return mCr.toString(); }

  // Test the new class:
  public static void main(String[] args) {
    DetergentTrue x = new DetergentTrue();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    print(x);
    print("Testing base class:");
    Cleanser.main(args);
  }	
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~
