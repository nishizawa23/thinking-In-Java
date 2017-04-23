package holding;

import java.util.*;
import net.mindview.util.Stack;

public class Exercise15 {
	public static void main (String [] args)
	{
		/* code */
		String mString = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		Stack<Character> mStack = new Stack<Character>();
		for(int i = 0; i < mString.length(); i++){
			//System.out.println(mString.charAt(i));
			Character tmp = mString.charAt(i);
			if(tmp.equals('+')){
				mStack.push(mString.charAt(i+1));
			}
			if(tmp.equals('-')){
				System.out.println(mStack.pop());
			}
		}
		
	}
}
