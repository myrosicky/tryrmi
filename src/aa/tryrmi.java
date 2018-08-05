package aa;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.net.*;
import aa.inface;
import sun.rmi.*;


public class tryrmi extends UnicastRemoteObject implements inface
{

	/**
	 * @param args
	 */
	
	
	
		public tryrmi() throws RemoteException
		{
			
		}
		
		public String hi() throws RemoteException
		{
			return "hi";
		}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			System.setProperty("java.rmi.server.codebase", inface.class.getProtectionDomain().getCodeSource().getLocation().toString());
			Registry rr=LocateRegistry.getRegistry();
			
			
			System.out.println("fdfsf");
			rr.bind("tryrmi", new tryrmi());
			
		}catch(Exception ee){ee.printStackTrace();}
		

	}

}
