package holding;

import java.util.*;

public class Exercise28{
	public static void main(String[] args) {
		Random rand = new Random();
		PriorityQueue<Double> mPQ = new PriorityQueue<Double>();
		for(int i = 0 ; i < 10 ; i++){
			mPQ.offer(rand.nextDouble());
		}
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(mPQ.poll());
		}
	}
} 
