package exceptions;

import java.util.*;

class OneException extends Exception {
}

public class Exercise10 {

        static void f() {
                System.out.println("f() function call g()");
                try {
                        g();
                } catch (OneException e) {
                        throw new RuntimeException(e);
                }
        }

        static void g() throws OneException {
                System.out.println("g() function whill throw OneException");
                throw new OneException();
        }

        public static void main(String[] args) {
                f();
        }
}
