package strings;

public class Exercise6 {
	public static void main(String[] args){
		String mString = String.format("int : %d long : %h float : %e double : %x", 9,100l,4.4444444f,10);
		System.out.println(mString);
	}
}
