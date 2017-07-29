//: exceptions/StormyInning.java
package exceptions; /* Added by Eclipse.py */
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.

class BaseballException extends RuntimeException {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends RuntimeException {}

abstract class Inning {
        public Inning() {}
        public void event() {
                // Doesn't actually have to throw anything
        }
        public void One() {
                System.out.println("One excepionts");
                        throw new UmpireArgument();
        }
        public abstract void atBat() throws Strike, Foul;
        public void walk() {} // Throws no checked exceptions
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
        public void event() ;
        public void rainHard() ;
}

public class Exercise29 extends Inning implements Storm {
        // OK to add new exceptions for constructors, but you
        // must deal with the base constructor exceptions:
        public Exercise29(){}
        public Exercise29(String s)
        throws Foul, BaseballException {}
        // Regular methods must conform to base class:
//!        void walk() throws PopFoul {} //Compile error
        public void walk() {} //Compile error
        // Interface CANNOT add exceptions to existing
        // methods from the base class:
//!        public void event() throws RainedOut {}
        // If the method doesn't already exist in the
        // base class, the exception is OK:
        public void rainHard(){}
        // You can choose to not throw any exceptions,
        // even if the base version does:
        public void event() {}
        // Overridden methods can throw inherited exceptions:
        public void atBat() {}
        public static void main(String[] args) {
//                try {
                        Exercise29 si = new Exercise29();
                        si.atBat();
//                } catch (PopFoul e) {
//                        System.out.println("Pop foul");
//                } catch (RainedOut e) {
//                        System.out.println("Rained out");
//                } catch (BaseballException e) {
//                        System.out.println("Generic baseball exception");
//                }
                // Strike not thrown in derived version.
//                try {
                        // What happens if you upcast?
                        Inning i = new Exercise29();
                        i.atBat();
                        // You must catch the exceptions from the
                        // base-class version of the method:
//               } catch (Strike e) {
//                        System.out.println("Strike");
//                } catch (Foul e) {
//                        System.out.println("Foul");
//                } catch (RainedOut e) {
//                        System.out.println("Rained out");
//                } catch (BaseballException e) {
//                        System.out.println("Generic baseball exception");
//                }

//                try {
                        Exercise29 sii = new Exercise29();
                        sii.One();
//                } catch (BaseballException e) {
//                        System.out.println("Generic baseball exception");
//                } catch (RainedOut e) {
//                        System.out.println("Rained out");
//                } catch (UmpireArgument e){
//                        System.out.println("UmpireArgument exception");
//                }
        }
} ///:~
