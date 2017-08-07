//: typeinfo/PetCount4.java
package typeinfo; /* Added by Eclipse.py */
import typeinfo.pets.*;
import net.mindview.util.*;
import generics.coffee.*;
import static net.mindview.util.Print.*;

public class Exercise12 {
  public static void main(String[] args) {
    TypeCounter counter = new TypeCounter(Coffee.class);
    CoffeeGenerator gen = new CoffeeGenerator();
    for(Coffee c : new CoffeeGenerator(5))
	counter.count(c);
    print(counter);
		
      }
}
