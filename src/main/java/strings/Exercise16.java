
//: strings/JGrep.java
package strings; /* Added by Eclipse.py */
import java.io.File;
import java.util.Arrays;
// A very simple version of the "grep" program.
// {Args: . "\\b[Ssct]\\w+"}
import java.util.regex.*;

public class Exercise16 {
  public static void main(String[] args) throws Exception {
    if(args.length < 2) {
      System.out.println("Usage: java dir file regex");
      System.exit(0);
    }
    System.out.println(args[1]);
//    System.out.println("^\\.\\w+".equals(args[1].trim()));
    Pattern p = Pattern.compile(args[1]);

    // Iterate through the lines of the input file:
    int index = 0;
    Matcher m = p.matcher("");
    
    File[] files = new File(args[0]).listFiles();
//    System.out.println("files : " + Arrays.toString(files));
    
    for(File file : files ) {
      m.reset(file.getName());
      while(m.find())
        System.out.println(index++ + ": " +
          m.group() + ": " + m.start());
    }
  }
} 
