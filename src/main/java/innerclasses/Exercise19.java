package innerclasses;

import java.util.*;

public class Exercise19 {
	class InnerClass {
		class IInnerClass{
			public String toString(){
				return "i am IInnerClass";
			}
		}
	}

	static class StaticInnerClass{
		static class StaticIInnerClass{
			public String toString(){
				return "i am StaticIInnerClass";
			}
		}
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise19.InnerClass.IInnerClass mII = (new Exercise19().new InnerClass()).new IInnerClass();
		System.out.println(mII);

		System.out.println(new StaticInnerClass.StaticIInnerClass());
	}
}
