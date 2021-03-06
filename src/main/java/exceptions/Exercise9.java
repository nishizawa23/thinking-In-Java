package exceptions;

import java.util.*;

class ExceptionA extends Exception {
        ExceptionA(String msg) {
                super(msg);
        }
}

class ExceptionB extends Exception {
        ExceptionB(String msg) {
                super(msg);
        }
}

class ExceptionC extends Exception {
        ExceptionC(String msg) {
                super(msg);
        }
}

public class Exercise9 {
        public static void f(int x) throws ExceptionA, ExceptionB, ExceptionC {

                throw new NullPointerException();
//              if (x < 0) throw new ExceptionA("x < 0");
//              if (x == 0) throw new ExceptionB("x == 0");
//              if (x > 0) throw new ExceptionC("x > 0");
        }
        public static void main(String[] args) {
                try {
                        f(0);
                        f(1);
                        f(-1);
                        // will catch any Exception type:
                } catch (Exception e) {
                        System.out.println("Caught Exception");
                        e.printStackTrace(System.out);
                } finally {
                        System.out.println("finally will aways do!");
                }
        }
}
