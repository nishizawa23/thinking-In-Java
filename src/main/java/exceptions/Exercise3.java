package exceptions;

import java.util.*;
import java.util.logging.*;
import java.io.*;

class ExceptionOne extends Exception {
        private static Logger logger = Logger.getLogger("ExceptionOne");

        static void logExceptionOne(Exception e) {
                StringWriter trace = new StringWriter();
                e.printStackTrace(new PrintWriter(trace));
                logger.severe(trace.toString());
        }
}

public class Exercise3 {
        public static void main(String[] args) {
                int [] mIntArray = new int [3];
                try {
                        mIntArray[3] = 10;

                } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("i am going to ExceptionOne");
                        ExceptionOne.logExceptionOne(e);
                } finally {
                        System.out.println("finally hello");
                }
        }
}
