package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise10 {
	public static String mString =
		    "Java now has regular expressions";
	private static String mRegulars[] = {"^Java","\\breg.*\\b","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}","s{0,3}"};
	
	public static void main(String[] args){
		for(String mRegular:mRegulars){
			System.out.println(mRegular);
			Pattern p = Pattern.compile(mRegular);
			Matcher m = p.matcher(mString);
			while(m.find()){
				System.out.println("match \\ "+m.group()+" \\  at positions " + 
						+ m.start() + " - " + (m.end() - 1));
			}
		}
	}
}
