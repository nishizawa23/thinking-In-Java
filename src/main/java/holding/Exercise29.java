package holding;

import java.util.*;

public class Exercise29{
	public static void main(String[] args) {
		PriorityQueue<Object> mPQ = new PriorityQueue<Object>();
		mPQ.offer(new Object());
/* CalssCastException: java.lang.Object cannot bo cast to java.lang.Comparable  */
		/* mPQ.offer(new Object()); */
	}
} 
