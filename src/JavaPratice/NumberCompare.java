package JavaPratice;
import java.util.Random;
import java.util.Scanner;

/* 2.아래와 같이 업다운 게임을 만드시오.
        게임시작 1
        게임종료 2
        >>
        1
        숫자를 입력해주세요 : 50
        Up ====> 9번 남아 있습니다.
        숫자를 입력해주세요 : 75
        Down ===> 8번 남아 있습니다.
        숫자를 입력해주세요 : 60
        Up ====> 7번 남아 있습니다.
        숫자를 입력해주세요 : 65
        Down ===> 6번 남아 있습니다.
        숫자를 입력해주세요 : 64
        일치
        게임시작 1
        게임종료 2
        >>
        2
        게임을 종료합니다. */

public class NumberCompare {

    int setNumber;
    private int life = 10;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void newGame() {

        setNumber = random.nextInt(100);
        life = 10;
    }

    public void guess(int num) {

        if(setNumber > num) {
            System.out.println("Up ====> " + --life + "번 남아 있습니다.");
        } else if (setNumber < num) {
            System.out.println("Down ===> " + --life + "번 남아 있습니다.");
        }

    }
    public void game() {

        newGame();

        while(true) {
            if (life == 0) {
                System.out.println("당신이 졌습니다.");
                break;
            }
            System.out.print("숫자를 입력해주세요 : ");
            int input = scanner.nextInt();
            if(setNumber == input) {
                System.out.println("일치");
                break;
            }
            guess(input);
        }
    }

    public void gameStart() {

        while(true) {
            System.out.println("게임시작 1");
            System.out.println("게임종료 2");
            System.out.println(">>");
            int input = scanner.nextInt();
            if(input == 1) {
                game();
            } else if(input == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}

class NumberCompareTest {

    public static void main(String[] args) {

        NumberCompare newGame = new NumberCompare();
        newGame.gameStart();
    }
}

