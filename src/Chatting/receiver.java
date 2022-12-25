package Chatting;

import java.io.DataInputStream;
import java.net.Socket;
import java.util.Scanner;

public class receiver extends Thread {

    String name;
    DataInputStream in;
    Socket socket;

    public receiver(Socket socket) {
        try {
            in = new DataInputStream(socket.getInputStream());
        } catch (Exception e) { e.printStackTrace();}
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while(in != null) {
            try {
                System.out.println(in.readUTF());

            } catch (Exception e) { e.printStackTrace(); }
        }
    }
}