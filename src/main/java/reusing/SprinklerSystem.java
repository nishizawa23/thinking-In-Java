//: reusing/SprinklerSystem.java
package reusing; /* Added by Eclipse.py */
// Composition for code reuse.

class WaterSource {
        private String s;
        WaterSource() {
                System.out.println("WaterSource()");
                s = "Constructed";
        }
        public String toString() {
                return s;
        }
}

public class SprinklerSystem {
        private String valve1, valve2, valve3, valve4;
        private WaterSource source = new WaterSource();
        private int i;
        private float f;
        public String toString() {
                StringBuilder mSb = new StringBuilder();
                mSb.append("valve1 = ");
                mSb.append(valve1);
                mSb.append(" ");

                mSb.append("valve2 = ");
                mSb.append(valve2);
                mSb.append(" ");

                mSb.append("valve3 = ");
                mSb.append(valve3);
                mSb.append(" ");

                mSb.append("valve4 = ");
                mSb.append(valve4);
                mSb.append(" \n");

                mSb.append("i = ");
                mSb.append(i);
                mSb.append(" ");

                mSb.append("f = ");
                mSb.append(f);
                mSb.append(" ");

                mSb.append("source =");
                mSb.append(source);
                mSb.append(" ");
                return
                        /*
                        "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 + "\n" +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source;
                        */
                        mSb.toString();
        }
        public static void main(String[] args) {
                SprinklerSystem sprinklers = new SprinklerSystem();
                System.out.println(sprinklers);
        }
} /* Output:
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0 source = Constructed
*///:~
