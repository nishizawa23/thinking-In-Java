package exceptions;

import java.util.*;
import java.util.logging.*;
import java.io.*;

public class Exercise27 {
        public static void main(String[] args) {
                int [] mIntArray = new int [3];
                try {
                        mIntArray[3] = 10;
                } catch (ArrayIndexOutOfBoundsException e) {
                        throw new RuntimeException(e);
                } finally {
                        System.out.println("finally hello");
                }
        }
}
