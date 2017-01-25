package access;

import java.util.*;
import access.test.*;

public class ProtectedTestMain {
	public static void main (String [] args)
	{
		/* code */
		ProtectedTest mP = new ProtectedTest();
		mP.testPrint();
		PTest mPt = new PTest();
		mPt.testPT();
	}
}
