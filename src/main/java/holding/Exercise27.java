package holding;

import java.util.*;

class Command {
	String name = null;
	Command(String name){
		this.name = name;
	}
	public void operation(){
		System.out.println("name " + name);
	}
	
}

class OpertionQueue{
	Queue<Command> mQueue;
	public Command setCommand(Command mC){
		mQueue.offer(mC);
		return mQueue.peek();
	}
	OpertionQueue(){
		mQueue = new LinkedList<Command>();
	}
	public Queue<Command> getQueue(){
		Command mC = mQueue.remove();
		mC.operation();
		return mQueue;
	}
}

public class Exercise27 {
	public static void main(String[] args) {
		ArrayList<String> mStrings = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		OpertionQueue mO = new OpertionQueue();
		for(String name : mStrings){
			mO.setCommand(new Command(name));
		}
		for(String name : mStrings){
			mO.getQueue();
		}
	}
}
