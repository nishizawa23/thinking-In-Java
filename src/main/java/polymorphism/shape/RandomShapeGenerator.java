//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;
import java.util.*;
import polymorphism.shape.RandomShapeGenerator;

public class RandomShapeGenerator implements Iterable<Shape>{
  private Random rand = new Random(47);
  private int number;
  private int index = 0;
  private Shape[] mShapes;
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
	  mShapes = new Shape[n];
	  for(int i = 0; i < n ; i++)
		  mShapes[i] = next();
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
			  return mShapes[index - 1];
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
