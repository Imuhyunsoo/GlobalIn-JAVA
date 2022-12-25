package Chatting;


import java.net.Socket;


public class client {
    public static void main(String[] args) {

        Socket socket;

        try{
            socket = new Socket("localhost",3333);
            System.out.println("접속");

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