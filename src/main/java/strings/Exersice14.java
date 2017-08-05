package strings; /* Added by Eclipse.py */
import java.util.*;


public class Exersice14 {
  public static void main(String[] args) {
    String input =
      "This!!unusual use!!of exclamation!!points";
    System.out.println(Arrays.toString(
      input.split("!!")));
    // Only do the first three:
    System.out.println(Arrays.toString(
      input.split("!!", 3)));
  }
}