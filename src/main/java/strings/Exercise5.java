package strings;

import java.util.*;

public class Exercise5 {
        public static void main(String[] args) {
                Formatter f = new Formatter(System.out);

                f.format("String : %s \ndex : %d \nUnicode : %c\n float : %f\n e: %e\n hex : %h\nx : %x\n %% : %%", "hello",16,'a',0.22,13.2,15,10);
        }
}
