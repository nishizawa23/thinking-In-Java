package innerclasses.hello;

import java.util.*;
import innerclasses.hello.world.HelloInterface;

public class Hello {

	private int apple;

	private void printApple(){
		System.out.println("i have " + apple + " apple !");
	}

	protected class HelloInner implements HelloInterface {
		public void hello(){
			System.out.println("hello world !");
		}

		public void setAppleNumber(int n){
			apple = n;
		}

		public void print(){
			printApple();
		}

		// you must set constructer public
		// see http://stackoverflow.com/questions/1487734/cant-access-protected-inner-class-while-inheriting
		// because inner class's construct is protect by default
		public HelloInner(){};
	}

	public HelloInner getHelloInner(){
		return new HelloInner();
	}
}
