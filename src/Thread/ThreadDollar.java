package Thread;

public class ThreadDollar extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 300; i++) {
            System.out.print(i);
            System.out.print("$");
        }
    }
}
