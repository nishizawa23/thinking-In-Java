package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise11 {
	private static final String mRegular = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
	private static final String mString = "Arline ate eight apples and one oragne while Anita hadn't any";

	public static void main(String[] args){
		Matcher m = Pattern.compile(mRegular).matcher(mString);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
