//: polymorphism/PolyConstructors.java
package polymorphism; /* Added by Eclipse.py */
// Constructors and polymorphism
// don't produce what you might expect.
import static net.mindview.util.Print.*;

class Glyph {
  void draw() { print("Glyph.draw()"); }
  Glyph() {
    print("Glyph() before draw()");
    draw();
    print("Glyph() after draw()");
  }
}	


class RectangularGlyph extends Glyph {
  private int radius = 1;
  RectangularGlyph(int r) {
    radius = r;
    print("RectangularGlyph.RectangularGlyph, radius = " + radius);
  }
  void draw() {
    print("RectangularGlyph.draw(), radius = " + radius);
  }

}
class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RoundGlyph.draw(), radius = " + radius);
  }
}	

public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
    new RectangularGlyph(10);
  }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
