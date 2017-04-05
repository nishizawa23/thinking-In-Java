package innerclasses;

import java.util.*;

interface Hello {
	void hello();
}

public class Exercise9 {

	private class InnerHello implements Hello{
		public void hello(){
				System.out.println("i am InnerHello hello !");
		}
	}

	public Hello getInnerHello(){
		return new InnerHello();
	}


	public Hello getHelloInterface(int i){
		if(i > 100){
			class EInner implements Hello {
				public void hello(){
					System.out.println("hello world");
				}
			}
			return new EInner();
		}else{
			return null;
		}
	}

	public static void main (String [] args)
	{
		/* code */
		Hello mHello = new Exercise9().getHelloInterface(101);
		if(mHello != null)
			mHello.hello();
		else
			System.out.println("mHello is null");

		Hello mHelloInner = new Exercise9().getInnerHello();
		mHelloInner.hello();
	}
}
