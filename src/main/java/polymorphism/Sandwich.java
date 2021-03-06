//: polymorphism/Sandwich.java
// Order of constructor calls.
package polymorphism;
import static net.mindview.util.Print.*;

class Meal {
  Meal() { print("Meal()"); }
}

class Bread {
  Bread() { print("Bread()"); }
}

class Cheese {
  Cheese() { print("Cheese()"); }
}

class Lettuce {
  Lettuce() { print("Lettuce()"); }
}

class Pickle {
  Pickle() { print("Pickle"); }
}

class Lunch extends Meal {
  Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
  PortableLunch() { print("PortableLunch()");}
}

interface FastFood {
	void what();
}

public class Sandwich extends PortableLunch implements FastFood {
  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();
  private Pickle p = new Pickle();
  public Sandwich() { print("Sandwich()"); }
  public static void main(String[] args) {
    Sandwich mS = new Sandwich();
	mS.what();
  }
  public void what(){
		System.out.println("i am Sandwich");
  }
} /* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*///:~
