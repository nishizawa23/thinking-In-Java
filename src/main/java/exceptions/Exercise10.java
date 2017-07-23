package exceptions;

import java.util.*;

class OneException extends Exception {
}

class TwoException extends Exception {
}

public class Exercise10 {

        static void f() throws TwoException {
                System.out.println("f() function call g()");
                try {
                        g();
                } catch (OneException e) {
                        e.printStackTrace();
                        throw new TwoException();
                }
        }

        static void g() throws OneException {
                System.out.println("g() function whill throw OneException");
                throw new OneException();
        }

        public static void main(String[] args) {
                try {
                       f(); 
                } catch(TwoException e){
                        e.printStackTrace();
                }
        }
}
