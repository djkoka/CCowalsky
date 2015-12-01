package classwork.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by CCowalsky on 26.11.2015.
 */
public class Server {

    private Map<InetAddress, String> ipAdressToName = new HashMap<>();


    public static void main(String[] args) throws IOException {
        new Server().star();
    }

    public void star() throws IOException {

        ServerSocket serverSocket = new ServerSocket(46623);

        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = reader.readLine();

            String name = checkName(socket, line);

            System.out.println(name + " : " + line);
            reader.close();
            socket.close();
        }
    }

    private String checkName(Socket socket, String line) {
        if (line.contains("my name ")) {
            String name = line.replace("my name ", "");

            System.out.println("greeting: " + line);
            InetAddress inetAddress = socket.getInetAddress();
            ipAdressToName.put(inetAddress, name);
        }
        String name = ipAdressToName.get(socket.getInetAddress());
        if (name == null) {
            name = socket.getInetAddress().toString();
        }

        return name;
    }
}
