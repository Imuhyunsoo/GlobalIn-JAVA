package Chatting;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;
        try{
            serverSocket = new ServerSocket(8080);
            socket = serverSocket.accept();

            sender sender = new sender(socket);
            receiver receiver = new receiver(socket);

            sender.start();
            receiver.start();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
