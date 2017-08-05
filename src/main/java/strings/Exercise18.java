//: strings/JGrep.java
package strings; /* Added by Eclipse.py */
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+"}
import java.util.regex.*;
import net.mindview.util.*;

public class Exercise18{
  public static void main(String[] args) throws Exception {
    if(args.length < 1) {
      System.out.println("Usage: input you java file");
      System.exit(0);
    }
    Pattern p = Pattern.compile("\\b[a-zA-Z]{2,}+");
    // Iterate through the lines of the input file:
    int index = 0;
    Matcher m = p.matcher("");
    for(String line : new TextFile(args[0])) {
      m.reset(line);
        System.out.println("line -------- " + line + "\n");
      while(m.find())
        System.out.println(index++ + ": " +
          m.group() + ": " + m.start());
    }
  }
}
