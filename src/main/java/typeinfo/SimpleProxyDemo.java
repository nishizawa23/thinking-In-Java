//: typeinfo/SimpleProxyDemo.java
package typeinfo; /* Added by Eclipse.py */
import static net.mindview.util.Print.*;

interface Interface {
        void doSomething();
        void somethingElse(String arg);
}

class RealObject implements Interface {
        private static int mDoSomething;
        private static int mSomethingElse;

        public void doSomething() {
                print("doSomething call " + (++mDoSomething) + " times");
        }
        public void somethingElse(String arg) {
                print("somethingElse " + arg + " call " + (++mSomethingElse) + " times");
        }
}

class SimpleProxy implements Interface {
        private Interface proxied;
        public SimpleProxy(Interface proxied) {
                this.proxied = proxied;
        }
        public void doSomething() {
                print("SimpleProxy doSomething");
                proxied.doSomething();
        }
        public void somethingElse(String arg) {
                print("SimpleProxy somethingElse " + arg);
                proxied.somethingElse(arg);
        }
}

class SimpleProxyDemo {
        public static void consumer(Interface iface) {
                iface.doSomething();
                iface.somethingElse("bonobo");
        }
        public static void main(String[] args) {
                consumer(new RealObject());
                consumer(new SimpleProxy(new RealObject()));
        }
} /* Output:
doSomething
somethingElse bonobo
SimpleProxy doSomething
doSomething
SimpleProxy somethingElse bonobo
somethingElse bonobo
*///:~
