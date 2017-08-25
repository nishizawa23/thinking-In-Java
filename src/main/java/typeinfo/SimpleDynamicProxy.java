//: typeinfo/SimpleDynamicProxy.java
package typeinfo; /* Added by Eclipse.py */
import java.lang.reflect.*;
import java.util.*;

class DynamicProxyHandler implements InvocationHandler {
        private Object proxied;
        public DynamicProxyHandler(Object proxied) {
                this.proxied = proxied;
        }
        public Object
        invoke(Object proxy, Method method, Object[] args)
        throws Throwable {
                /*
                 * trying to print proxy leads to:
                 * StackOverFlowError
                 * at AbstractStringBuilder.<init>(Unknown Source)
                 * at StringBuilder.<init>(Unknown Source)
                 * at DynamicProxyHandler.invoke(SimpleDynamicProxy23.java)
                 * at $Proxy0.toString(Unknown Source)
                 * at String.valueOf(Unknown Source)
                 * at StrinbBuilcer.append(Unknown Source)
                 * at DynamicProxyHandler.invoke(SimpleDynamicProxy23.java), etc,
                 * probably due to infinite recursion because calls to toString()
                 * are passed repeatedly back to this invoke method
                 */
                // System.out.println("proxy: " + proxy); // error
                long timeIn = new Date().getTime();
                System.out.println("**** proxy: " + proxy.getClass() +
                                   ", method: " + method + ", args: " + args +
                                   ", invoked at " + timeIn + " on " + (new Date()));
                if (args != null)
                        for (Object arg : args)
                                System.out.println("  " + args);
                long timeOut = new Date().getTime();
                System.out.println("Method call-return time: " + (timeOut - timeIn) + " msecs");
                return method.invoke(proxied, args);
        }
}

class SimpleDynamicProxy {
        public static void consumer(Interface iface) {
                iface.doSomething();
                iface.somethingElse("bonobo");
        }
        public static void main(String[] args) {
                RealObject real = new RealObject();
                consumer(real);
                // Insert a proxy and call again:
                Interface proxy = (Interface)Proxy.newProxyInstance(
                                          Interface.class.getClassLoader(),
                                          new Class[] { Interface.class },
                                          new DynamicProxyHandler(real));
                consumer(proxy);
        }
} /* Output: (95% match)
doSomething
somethingElse bonobo
**** proxy: class $Proxy0, method: public abstract void Interface.doSomething(), args: null
doSomething
**** proxy: class $Proxy0, method: public abstract void Interface.somethingElse(java.lang.String), args: [Ljava.lang.Object;@42e816
  bonobo
somethingElse bonobo
*///:~
