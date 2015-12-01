package classwork.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by CCowalsky on 26.11.2015.
 */
public class MultithreadServer {

    public static void main(String[] args) throws IOException {
        new MultithreadServer().start();
    }

    private void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(34567);
        while (true){
            Socket socket = serverSocket.accept();
            Thread thread = new Thread(new SocketThread(socket));
            thread.start();

        }
    }

}
