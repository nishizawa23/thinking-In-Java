//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;
import java.util.*;
import polymorphism.shape.RandomShapeGenerator;

public class RandomShapeGenerator implements Iterable<Shape>{
  private Random rand = new Random(47);
  private int number;
  private int index = 0;
  public Shape next() {
    switch(rand.nextInt(4)) {
      default:
      case 0: return new Car();
      case 1: return new Square();
      case 2: return new Triangle();
      case 3: return new Circle();
    }
  }
  RandomShapeGenerator(int n){
	  number = n;
  }
  public Iterator<Shape> iterator(){
	  return new Iterator<Shape>(){

		  public boolean hasNext(){
			  if(index<number){
				  index++;
				  return true;
			  }else{
				  return false;
			  }
		  }
	  	public Shape next(){
			  return new Car();
	  	}
		public void remove(){
			throw new UnsupportedOperationException();
		}
	  };
  }
  public static void main(String[] args) {
	  RandomShapeGenerator mR = new RandomShapeGenerator(8);
	  for(Shape s : mR )
		  System.out.println("Shape " + s);
  	
  }
} ///:~
