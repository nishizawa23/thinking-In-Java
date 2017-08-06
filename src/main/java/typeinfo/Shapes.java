//: typeinfo/Shapes.java
package typeinfo; /* Added by Eclipse.py */
import java.util.*;

abstract class Shape {
        void draw() {
                System.out.println(this + ".draw()");
        }
        abstract public String toString();
}

class Circle extends Shape {
        public String toString() {
                return "Circle";
        }
}

class Square extends Shape {
        public String toString() {
                return "Square";
        }
}

class Triangle extends Shape {
        public String toString() {
                return "Triangle";
        }
}

class Rhomboid extends Shape {
        public String toString() {
                return "Rhomboid";
        }
}

public class Shapes {
        public static void main(String[] args) {
                List<Shape> shapeList = Arrays.asList(
                                                new Circle(), new Square(), new Triangle()
                                        );
                for (Shape shape : shapeList)
                        shape.draw();

                Rhomboid mR = new Rhomboid();
                Shape mS = (Shape)mR;
                System.out.println("Rhomboid upto Shape : " + mS);
                if (mS instanceof Rhomboid) {
                        Rhomboid mRother = (Rhomboid)mS;
                        System.out.println("Shape downto Rhomboid: " + mRother);
                }
                if (mS instanceof Circle) {
                        Circle mC = (Circle)mS;
                        System.out.println("Shape upto Circle: " + mC);
                } else {
                        System.out.println("Shape can not downto Circle.");
                }
        }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
