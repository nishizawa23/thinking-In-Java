package initialization;

import java.util.*;

public class StringMainVararg {
	public static void main (String ... args)
	{
		/* code */
		if(args.length != 0){
			for(String s : args){
				System.out.println("s " + s);
			}
		}else{
				System.out.println("no args for main");
		}
	}
}
