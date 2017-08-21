//: generics/coffee/Cappuccino.java
package generics.coffee;
public class Cappuccino extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Coffee> {
		public Coffee create() {
			return new Cappuccino();
		}
	}
} ///:~
