package exceptions;

import java.util.*;

class OneException extends Exception {
        public String toString() {
                return "OneException";
        }
}

class One {
        public void One() throws OneException {
                System.out.println("Constraction in One class");
                throw new OneException();
        }
}

public class Exercise21 extends One {

        public Exercise21 () throws OneException {
                System.out.println("Constraction in Exercise21 class");
        }

        public static void main(String[] args) {
                try {
                        Exercise21 mE = new Exercise21();
                } catch (OneException e) {
                        e.printStackTrace();
                }
        }
}
