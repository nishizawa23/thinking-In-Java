package exceptions;

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

class ExceptionTwo extends Exception {
        private static Logger logger = Logger.getLogger("ExceptionTwo");

        static void logExceptionTwo(Exception e) {
                StringWriter trace = new StringWriter();
                e.printStackTrace(new PrintWriter(trace));
                logger.severe(trace.toString());
        }
}

public class Exercise6 {

        public static void main(String[] args) {
                try {
                        throw new NullPointerException();
                } catch (Exception e) {
                        System.out.println("one ExceptionOne");
                        ExceptionOne.logExceptionOne(e);
                }

                try {
                        throw new NullPointerException();
                } catch (Exception e) {
                        System.out.println("one ExceptionOne");
                        ExceptionTwo.logExceptionTwo(e);
                }

        }
}
