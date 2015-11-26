package classwork.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by CCowalsky on 26.11.2015.
 */
public class SocketThread implements Runnable {
    private Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Socket localSocket = socket;
                while (true) {
                    String massage = reader.readLine();
                    if(massage == null){
                        System.out.println("disconnect ");
                        break;
                    }
                    System.out.println(massage);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
