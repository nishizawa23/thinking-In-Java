//: generics/coffee/Americano.java
package generics.coffee;

import typeinfo.factory.*;

public class Americano extends Coffee {
	public static class Factory implements typeinfo.factory.Factory<Coffee> {
		public Coffee create() {
			return new Americano();
		}
	}
} /// :~
