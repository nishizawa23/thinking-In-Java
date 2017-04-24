package holding;

import java.util.*;

public class Gerbil {
	private static int counter;
	private final int number = counter++;
	public void hop(){
		System.out.println("jump hop id " + number);
	}

	public void display(Iterator<Gerbil> g){
		while(g.hasNext()){
			g.next().hop();
		}
	}

	public static void main (String [] args)
	{
		/* code */
		ArrayList<Gerbil> mGerbilList = new ArrayList<Gerbil>();
		Map<Integer,Gerbil> mMap = new HashMap<Integer,Gerbil>();
		for(int i = 0; i < 10; i++){
			mGerbilList.add(new Gerbil());
			mMap.put(i,new Gerbil());
		}

		for(int i = 0; i < mGerbilList.size(); i++)
			mGerbilList.get(i).hop();

		new Gerbil().display(mGerbilList.iterator());

		for(int i : mMap.keySet()){
			System.out.println("no i " + i);
			mMap.get(i).hop();
		}
	}
}
