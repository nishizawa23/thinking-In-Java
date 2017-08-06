package typeinfo;

import java.lang.reflect.Field;
import java.util.*;

public class Exercise8 {

	private static void getSuperClass(Class<?> mC, String mClassName) {
		if (mC.getSuperclass() != null) {
			System.out.println("Class : " + mClassName + " has spuer class " + mC.getSuperclass());
			for (Field mf : mC.getDeclaredFields())
				System.out.println("Class Field : " + mf.getName());
			for (Class<?> mInterfaceClass : mC.getInterfaces()) {
				System.out.print("interface " + mInterfaceClass.getCanonicalName());
				for (Field mi : mInterfaceClass.getDeclaredFields())
					System.out.println("Class Field : " + mi.getName());
			}
			getSuperClass(mC.getSuperclass(), mC.getSuperclass().getCanonicalName());
		}
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please input args for class");
			return;
		}
		String mClassName = args[0];
		try {
			Class<?> mC = Class.forName(mClassName);
			// Exercise8.getSuperClass(mC,mClassName);
			getSuperClass(mC, mClassName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
