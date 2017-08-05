package strings; /* Added by Eclipse.py */
import java.util.HashMap;
import java.util.regex.*;

public class Groups12 {
  static public final String POEM =
    "Twas brillig, and the slithy toves\n" +
    "Did gyre and gimble in the wabe.\n" +
    "All mimsy were the borogoves,\n" +
    "And the mome raths outgrabe.\n\n" +
    "Beware the Jabberwock, my son,\n" +
    "The jaws that bite, the claws that catch.\n" +
    "Beware the Jubjub bird, and shun\n" +
    "The frumious Bandersnatch.";
  private static HashMap<String, Integer> mHashMap = new HashMap<String, Integer>();
  public static void main(String[] args) {
    Matcher m =
      Pattern.compile("(?m)(\\b[a-z]+)")
        .matcher(POEM);
    while(m.find()) {
    	System.out.println(m.groupCount() + " " + m.group());
    	if(mHashMap.containsKey(m.group())){
    		int num = mHashMap.get(m.group())+1;
    		mHashMap.put(m.group(), num);
    	}else{
    		mHashMap.put(m.group(), 1);
    	}    	
    }
    System.out.println(mHashMap.toString());
  }
}
