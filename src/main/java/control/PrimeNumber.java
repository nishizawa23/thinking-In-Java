package control;

import java.util.*;

public class PrimeNumber {
	public static void main (String [] args)
	{
		/* code */
		for(int i = 2; i < 100; i++){
			if(i == 2){
				System.out.println(i + " is prime number");
				continue;
			}
			for(int j = 2; j<i; j++){
				if(i%j == 0){
					break;
				}
				if(i == j+1){
					System.out.println(i + " is prime number");
				}
			}
		}
	}
}
