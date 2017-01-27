package access;

import java.util.*;

public class ConnectionManager {

	private static int mConnectionNumber = 10;

	private static Connection [] mConnections = new Connection[mConnectionNumber];
	static {
		for(int i = 0; i < 10 ; i++)	
			mConnections[i] = new Connection();
	}

	public static void main (String [] args)
	{
		/* code */
		for(int i = 0; i < 12; i++){
			ConnectionManager.getConnection();
		}
	}

	public static Connection getConnection(){
		if(mConnectionNumber > 0){
			mConnectionNumber--;
			System.out.println("retrun Connection");
			return mConnections[mConnectionNumber];
		}else{
			System.out.println("retrun null");
			return null;
		}
		
	}
}
