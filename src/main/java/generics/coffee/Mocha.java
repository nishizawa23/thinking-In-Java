//: generics/coffee/Mocha.java
package generics.coffee;
public class Mocha extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Coffee> {
		public Coffee create() {
			return new Mocha();
		}
	}
} ///:~
