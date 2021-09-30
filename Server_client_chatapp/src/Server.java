import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket ss = new ServerSocket(2000);
		Socket s = ss.accept();
		
		System.out.println("Client connected");
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("Client : "+str);
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("This is server");
		pr.flush();

	}

}
