package exceptions;

import java.util.*;

class MyExceprtion extends Exception {
        String mName;
        MyExceprtion(String mName) {
                super(mName);
                this.mName = mName;
        }
}

public class Exercise5 {

        static int mErrorTimes = 0;
        static boolean mFails = true;

        static void i_am_error() throws MyExceprtion {
                if (mErrorTimes < 3) {
                        mErrorTimes++;
                        throw new MyExceprtion("i am MyExceprtion " + mErrorTimes);
                }
        }

        public static void main(String[] args) {

                while (mFails) {
                        try {
                                i_am_error();
                                mFails  = false;
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                }
        }
}
