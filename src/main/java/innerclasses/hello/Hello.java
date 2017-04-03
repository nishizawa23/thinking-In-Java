package innerclasses.hello;

import java.util.*;
import innerclasses.hello.world.HelloInterface;

public class Hello {

	protected class HelloInner implements HelloInterface {
		public void hello(){
			System.out.println("hello world !");
		}
	}

	public HelloInterface getHelloInterface(){
		return new HelloInner();
	}
}
