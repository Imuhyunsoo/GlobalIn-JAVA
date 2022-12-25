package Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientCopy extends Thread {

    @Override
    public void run() {

        try {
            Socket socket = new Socket("localhost", 7777);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String str = null;
            BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));

            while ((str = sReader.readLine()) != null) {
                writer.println(str);
                System.out.println("output : " + str);
            }

            writer.close();
            reader.close();
            sReader.close();
            socket.close();
        }
        catch(Exception e) {}
    }
}
