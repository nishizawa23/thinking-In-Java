package exceptions;

import java.util.*;

public class Exercise3{
	public static void main(String[] args) {
		int [] mIntArray= new int [3];
		try {
			mIntArray[3] = 10;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally hello");
		}
	}
} 
