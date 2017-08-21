package typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.Class;

public class Exercise20 {

	static public void main(String args[]) {
		// if (args.length < 1) {
		// System.out.println("Please input class name in args[0]");
		// return;
		// }

		// System.out.println("You input " + args[0]);

		// printClass(args[0]);
		printClass("java.lang.Class");
	}

	static private void printClass(String string) {
		// TODO Auto-generated method stub
		try {
			Class inputClass = Class.forName(string);
			Constructor[] mIputClassConstructor = inputClass.getConstructors();

			for (Constructor mC : mIputClassConstructor) {
				System.out.println("Class constructor : " + mC.toString());
			}

			Method[] mMethods = inputClass.getMethods();

			for (Method mM : mMethods) {
				System.out.println("Class mMethods : " + mM.toString());
			}

			Class[] mInterfaceses = inputClass.getInterfaces();
			for (Class mC : mInterfaceses) {
				System.out.println("Class Interface ---: " + mC.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

	}

}
