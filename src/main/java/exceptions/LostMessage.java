//: exceptions/LostMessage.java
package exceptions; /* Added by Eclipse.py */
// How an exception can be lost.

class VeryImportantException extends Exception {
        public String toString() {
                return "A very important exception!";
        }
}

class HoHumException extends Exception {
        public String toString() {
                return "A trivial exception";
        }
}

class ThreeException extends Exception {
        public String toString() {
                return "A three exception";
        }
}

public class LostMessage {
        void f() throws VeryImportantException {
                throw new VeryImportantException();
        }
        void dispose() throws HoHumException, ThreeException {
                try {
                        throw new HoHumException();
                } catch (Exception e) {
                        System.out.println("get HoHumException");
                        throw new ThreeException();
                }
        }
        public static void main(String[] args) {
                try {
                        LostMessage lm = new LostMessage();
                        try {
                                lm.f();
                        } catch (VeryImportantException e) {
                                System.out.println(e);
                        } finally {
                                lm.dispose();
                        }
                } catch (Exception e) {
                        System.out.println(e);
                }
        }
} /* Output:
A trivial exception
*///:~
