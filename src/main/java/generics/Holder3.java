//: generics/Holder3.java
package generics; /* Added by Eclipse.py */

import typeinfo.pets.*;

public class Holder3<T> {
        private T a;
        public Holder3(T a) {
                this.a = a;
        }
        public void set(T a) {
                this.a = a;
        }
        public T get() {
                return a;
        }
        public static void main(String[] args) {
                Holder3<Pet> h3 = new Holder3<Pet>(Pets.randomPet());
                System.out.println(h3.get());
                // can also hold a subclass of Pet:
                h3.set(new Dog());
                System.out.println(h3.get());
                // can also hold a sububclass of Pet:
                h3.set(new Gebil());
                System.out.println(h3.get());
                // h3.set("Not an Automobile"); // Error
                // h3.set(1); // Error
        }
} ///:~
