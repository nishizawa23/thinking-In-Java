package typeinfo;

import typeinfo.secret.*;
import java.lang.reflect.*;

public class Exercise25 {
        public static void main(String[] args) throws Exception {
                A a = SecretMaker.makeSecret();
                System.out.println("a is of class type: " + a.getClass().getName());
                for (Method m : a.getClass().getDeclaredMethods()) {
                        m.setAccessible(true);
                        m.invoke(a);
                }
        }
}
