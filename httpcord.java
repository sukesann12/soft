package g18080.http;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.netSocket;

public class Main {

	public static void main(String[] arge)throws Exception{
		system.out.println("start >>>");

		try (
			ServerSocket server = new ServerSocket(80);
			Socket socket = server.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
		) {


		in.lines().forEach(System.out::println);
		}

		system.out.println("<<< end");
		}
}
