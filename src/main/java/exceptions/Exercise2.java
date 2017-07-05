package exceptions;

import java.util.*;

class Hello {
        public void sayHelo() {
                System.out.println("hello world");
        }
}

class MyException extends Exception {

}

class World {
        void f() throws NullPointerException, MyException {
                throw new NullPointerException();
        }
}

public class Exercise2 {
        public Hello mHello = null;
        static private World mWorld = null;
        public static void main(String[] args) {
                try {
                        new Exercise2().mHello.sayHelo();

                } catch (Exception e) {
                        e.printStackTrace();
                } finally {
                        System.out.println("finally hello");
                }

                mWorld = new World();
                try {

                        mWorld.f();
                } catch (MyException e) {
                        e.printStackTrace();
                } catch (NullPointerException e) {
                        e.printStackTrace();
                } finally {
                        System.out.println("finally world");
                }

        }
}
