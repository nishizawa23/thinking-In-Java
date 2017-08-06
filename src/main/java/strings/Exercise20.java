package strings;

import java.util.*;


public class Exercise20 {

        public int a;
        public long b;
        public float c;
        public double d;
        public String e;

        public Exercise20(int a, long b, float c, double d, String e) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e;
        }

        public String toString() {
                return ("int a : " + a + " long b : " + b + " float : " + c + " double : " + d + " String : " + e);
        }

        public static void main(String[] args) {
                Scanner stdin = new Scanner(System.in);
                System.out.println("Please input a int ");
                int a = stdin.nextInt();
                stdin.nextLine();
                System.out.println("Please input a long");
                long b = stdin.nextLong();
                System.out.println("Please input a float");
                float c = stdin.nextFloat();
                System.out.println("Please input a double");
                double d = stdin.nextDouble();
                System.out.println("Please input a string");
                stdin.nextLine();
                String e = stdin.nextLine();

                Exercise20 mE = new Exercise20(a, b, c, d, e);

                System.out.println("Exercise20 : " + mE.toString());
        }
}
