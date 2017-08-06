//: typeinfo/Shapes.java
package typeinfo; /* Added by Eclipse.py */
import java.util.*;

abstract class Shape {
        void draw() {
                System.out.println(this + ".draw()");
        }
        abstract public String toString();
        abstract public void rotate();
}

class Circle extends Shape {
        public String toString() {
                return "Circle";
        }
        public void rotate(){
                System.out.println("Circle rotate");
        }
}

class Square extends Shape {
        public String toString() {
                return "Square";
        }
        public void rotate(){
                System.out.println("Square rotate");
        }
}

class Triangle extends Shape {
        public String toString() {
                return "Triangle";
        }
        public void rotate(){
                System.out.println("Triangle rotate");
        }
}

class Rhomboid extends Shape {
        public String toString() {
                return "Rhomboid";
        }
        public void rotate(){
                System.out.println("Rhomboid rotate");
        }
}

public class Shapes {
        public static void main(String[] args) {
                List<Shape> shapeList = Arrays.asList(
                                                new Circle(), new Square(), new Triangle(), new Rhomboid()
                                        );
                for (Shape shape : shapeList){
                        shape.draw();
                        if(!(shape instanceof Circle))
                                shape.rotate();
                }

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
