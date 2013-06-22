import java.net.Socket;
import java.net.InetSocketAddress;
import java.io.IOException;

class Client {
	public static void main(String args[]) {
		if ( args.length != 2 ) {
			System.out.println("Usage : java Client <ip address> <port>");
			return;
		} 
		String adr = args[0];
		String port = args[1];

		try {
			Socket sock = new Socket();
			sock.connect(new InetSocketAddress(adr, Integer.parseInt(port)));

			sock.close();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}
}
