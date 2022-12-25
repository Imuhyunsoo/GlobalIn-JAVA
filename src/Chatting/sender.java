package Chatting;



import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class sender extends Thread {

    String name;
    DataOutputStream out;
    Socket socket;

    public sender(Socket socket) {
        try {
            out = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
        } catch (Exception e) { e.printStackTrace();}
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while(out != null) {
            try {
                out.writeUTF(name + scanner.nextLine());

            } catch (Exception e) { e.printStackTrace(); }
        }
    }
}
