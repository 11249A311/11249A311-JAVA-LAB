import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(6000);
        System.out.println("Server waiting...");

        Socket socket = server.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String message = in.readLine();
        System.out.println("Client: " + message);

        out.println("Hello Client!");

        socket.close();
        server.close();
    }
}