package Thread;

public class ThreadStar extends Thread {

    @Override
    public void run() {

        for(int i = 0; i < 900; i++) {
            System.out.print("*");
        }
    }
}
