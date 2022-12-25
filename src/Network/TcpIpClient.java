package Network;

import java.io.*;
import java.net.Socket;

public class TcpIpClient {

    public static void main(String[] args) {

        try {
            String serverIP = "127.0.0.1";
            System.out.println("서버에 연결중입니다. 서버 IP : " + serverIP);
            Socket socket = new Socket(serverIP, 7777);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("서버로부터  받은 메세지 : " + dis.readUTF());
            System.out.println("연결을 종료합니다.");

            dis.close();
            socket.close();
            System.out.println("연결이 종료되었습니다.");
        }
        catch(Exception e) {}
    }
}
