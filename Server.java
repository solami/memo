import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.IOException;
import java.net.UnknownHostException;

class Server {
	public static void main(String args[]) {

		if ( args.length != 2 ) {
			System.out.println("Usage : java Server <ip address> <port>");
			return;
		}

		String adr = args[0];
		String port = args[1];

		try {
			ServerSocket srvSocket = new ServerSocket(Integer.parseInt(port), 0, InetAddress.getByName(adr) );
			Socket socket = srvSocket.accept();
		
			System.out.println("Close -> " + adr + ":" + port );
			socket.close();
			srvSocket.close();

		} catch  ( UnknownHostException e ) {
			e.printStackTrace();
		} catch ( IOException e ) { 
			e.printStackTrace();
		}
	}
}
