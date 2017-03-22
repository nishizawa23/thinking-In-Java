package polymorphism;

import java.util.*;

class AlertStatus {
	public void getStatus(){}
}

class StartStatus extends AlertStatus {
	public void getStatus(){
		System.out.println("StartStatus");
	}
}

class StopStatus extends AlertStatus {
	public void getStatus(){
		System.out.println("StopStatus");
	}
}

class Startship {
	private AlertStatus mAlertStatus;
	Startship (){
		mAlertStatus = new StartStatus();
	}
	public void getStatus(){
		mAlertStatus.getStatus();
	}

	public void changeStatus(){
		mAlertStatus = new StopStatus();
	}
}

class StarshipTest {
	public static void main (String [] args)
	{
		/* code */
		Startship mSartship = new Startship();
		mSartship.getStatus();
		mSartship.changeStatus();
		mSartship.getStatus();
	}
}
