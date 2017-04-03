package innerclasses.hello;

import java.util.*;
import innerclasses.hello.world.HelloInterface;

public class Hello {

	protected class HelloInner implements HelloInterface {
		public void hello(){
			System.out.println("hello world !");
		}
		// you must set constructer public
		// see http://stackoverflow.com/questions/1487734/cant-access-protected-inner-class-while-inheriting
		// because inner class's construct is protect by default
		public HelloInner(){};
	}

	public HelloInterface getHelloInterface(){
		return new HelloInner();
	}
}
