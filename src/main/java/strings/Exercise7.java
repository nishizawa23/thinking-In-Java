package strings;

import java.util.Arrays;
import java.util.List;

public class Exercise7 {
	private static final String mLine1 = "Hello world.";
	private static final String mLine2 = "Hello world";
	private static final String mLine3 = "hello world.";

	public static void main(String[] args) {

		List<String> mLineList = Arrays.asList(mLine1, mLine2, mLine3);
		for (String mLines : mLineList) {
			System.out.println(mLines);
			System.out.println(mLines.matches("^[A-Z].+\\.$"));
		}
	}
}
