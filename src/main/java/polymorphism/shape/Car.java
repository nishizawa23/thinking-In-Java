//: polymorphism/shape/Circle.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Car extends Shape {
  @Override
  public void draw() { print("Car.draw()"); }
  @Override
  public void erase() { print("Car.erase()"); }
  public void hello(){
	System.out.println("Car hello world");
  }
} ///:~
