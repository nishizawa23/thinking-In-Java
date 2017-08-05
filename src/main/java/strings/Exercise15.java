//: strings/JGrep.java
package strings; /* Added by Eclipse.py */
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+" "Pattern.CASE_INSENSITIVE|Pattern.MULTILINE"}
import java.util.regex.*;
import net.mindview.util.*;

public class Exercise15 {
  public static void main(String[] args) throws Exception {
    if(args.length < 2) {
      System.out.println("Usage: java JGrep file regex");
      System.exit(0);
    }
	int flag = 0;
	for(String m : args[2].split("|")){
		if("Pattern.CASE_INSENSITIVE".equals(m))
			flag |= Pattern.CASE_INSENSITIVE;
		if("Pattern.MULTILINE".equals(m))
			flag |= Pattern.MULTILINE;
	}

    Pattern p = Pattern.compile(args[1],flag);
    // Iterate through the lines of the input file:
    int index = 0;
    Matcher m = p.matcher("");
    for(String line : new TextFile(args[0])) {
      m.reset(line);
      while(m.find())
        System.out.println(index++ + ": " +
          m.group() + ": " + m.start());
    }
  }
} /* Output: (Sample)
0: strings: 4
1: simple: 10
2: the: 28
3: Ssct: 26
4: class: 7
5: static: 9
6: String: 26
7: throws: 41
8: System: 6
9: System: 6
10: compile: 24
11: through: 15
12: the: 23
13: the: 36
14: String: 8
15: System: 8
16: start: 31
*///:~
