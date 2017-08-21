//: typeinfo/toys/ToyTest.java
// Testing class Class.
package typeinfo.toys;

import static net.mindview.util.Print.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

interface Exercise2Interface {
}

class Toy {
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	// delete default constructor will fail whit newInstance
	private int m;

	public Toy() {
	}

	public Toy(int i) {
		m = i;
	}

	public String toString() {
		return "toy toString m " + m;
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Exercise2Interface {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name : " + cc.getCanonicalName());
	}

	static private Toy reflectConstructors(String mToy) {
		Constructor[] ctors;
		try {
			ctors = Class.forName(mToy).getConstructors();
			for (Constructor ctor : ctors) {
				if (ctor.getParameterCount() == 1)
					try {
						return (Toy) ctor.newInstance(2);
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// System.out.print("Toy constructors+++" + ctors.toString());

		return null;
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("typeinfo.toys.FancyToy");
		} catch (ClassNotFoundException e) {
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();

		System.out.println(reflectConstructors("typeinfo.toys.Toy").toString());
		Object obj = null;
		// try {
		// Requires default constructor:
		// obj = up.newInstance();
		obj = reflectConstructors("typeinfo.toys.Toy");
		// } catch (InstantiationException e) {
		// print("Cannot instantiate");
		// System.exit(1);
		// } catch (IllegalAccessException e) {
		// print("Cannot access");
		// System.exit(1);
		// }
		printInfo(obj.getClass());
	}
} /*
	 * Output: Class name: typeinfo.toys.FancyToy is interface? [false] Simple
	 * name: FancyToy Canonical name : typeinfo.toys.FancyToy Class name:
	 * typeinfo.toys.HasBatteries is interface? [true] Simple name: HasBatteries
	 * Canonical name : typeinfo.toys.HasBatteries Class name:
	 * typeinfo.toys.Waterproof is interface? [true] Simple name: Waterproof
	 * Canonical name : typeinfo.toys.Waterproof Class name:
	 * typeinfo.toys.Shoots is interface? [true] Simple name: Shoots Canonical
	 * name : typeinfo.toys.Shoots Class name: typeinfo.toys.Toy is interface?
	 * [false] Simple name: Toy Canonical name : typeinfo.toys.Toy
	 */// :~
