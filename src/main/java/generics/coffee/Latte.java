//: generics/coffee/Latte.java
package generics.coffee;
public class Latte extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Coffee> {
		public Coffee create() {
			return new Latte();
		}
	}
} ///:~
