//: typeinfo/PetCount4.java
package typeinfo; /* Added by Eclipse.py */
import typeinfo.pets.*;
import net.mindview.util.*;
import typeinfo.factory.*;
import static net.mindview.util.Print.*;

public class Exercise13 {
  public static void main(String[] args) {
    TypeCounter counter = new TypeCounter(Part.class);
    for(int i = 0; i < 10; i++)
	counter.count(Part.createRandom());
    print(counter);
		
      }
}
