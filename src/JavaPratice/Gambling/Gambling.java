package JavaPratice.Gambling;

import java.util.Random;
import java.util.Scanner;

public class Gambling {

    private int firstNum;
    private int secondNum;
    private int thirdNum;
    Player player1 = new Player();
    Player player2 = new Player();

    private boolean state = true;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void setInput() {

        player1.setInput("一つ");
        player2.setInput("二つ");
    }
    public void numberSet() {

        firstNum = random.nextInt(3);
        secondNum = random.nextInt(3);
        thirdNum = random.nextInt(3);
    }

    public void setTurn() {

        if(state) {
            System.out.println("[" + player1.setName() + "]:");
            state = false;
        }
        else {
            System.out.println("[" + player2.setName() + "]:");
            state = true;
        }
        System.out.print(firstNum + "\t" + secondNum + "\t" + thirdNum + "\t");
    }

    public void playGame() {

        setInput();
        while(true) {
            numberSet();
            setTurn();
            if((firstNum == secondNum) && (firstNum == thirdNum)) {
                System.out.println( player1.setName() + "が勝ちました。");
                break;
            }
            System.out.println("残念ですね！");
            scanner.nextLine();
        }
    }
}