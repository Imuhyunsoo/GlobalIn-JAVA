package JavaPratice.RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class ChangKenPo {
    private String user = "입력"; // USER
    private int com; // COMPUTER
    private String tryGame = null;
    private String comStr = null;  // Random 으로 만든 숫자형태의 가위바위보를 문자열로 전환
    Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
    Random random = new Random(); // 랜덤 객체 생성

    public void newGameSet() { // 새 게임시 컴퓨터 가위바위보 새로 세팅
        com = random.nextInt(3); // 0 : 가위, 1 : 바위, 2 : 보
        if (com == 0) {
            comStr = "가위";
        } else if (com == 1) {
            comStr = "바위";
        } else {
            comStr = "보";
        }
    }

    public void input() { // 가위 바위 보 입력 받기
        while (true) {
            try {
                System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
                this.user = scanner.nextLine();
                if (!(user.equals("가위") || user.equals("바위") || user.equals("보"))) {
                    throw new Exception("(ERROR) 잘못입력하셨습니다.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void rules() {
        if ((user.equals("가위") && com == 0) || (user.equals("바위") && com == 1) || (user.equals("보") && com == 2)) {
            System.out.println("비겼습니다.");
        } else if ((user.equals("가위") && com == 2) || (user.equals("바위") && com == 0) || (user.equals("보") && com == 1)) {
            System.out.println("당신이 이겼습니다.");
        } else {
            System.out.println("당신이 졌습니다.");
        }
    }

    public boolean more() {
        boolean start = true;

        while (start) {
            try {
                System.out.println("더 하시겠습니까? (Y/N)");
                tryGame = scanner.nextLine();
                if (!(tryGame.equals("Y") || tryGame.equals("N"))) {
                    throw new Exception("(ERROR) 잘못입력하셨습니다. ");
                } else {
                    if (tryGame.equals("Y")) {
                        start = false;
                        return true;
                    } else {
                        start = false;
                        System.out.println("게임이 종료됩니다.");
                        return false;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } return false;
    }


    public void start() {
        do {
            newGameSet();
            input();
            System.out.println("컴퓨터 : " + comStr );
            rules();
        } while(more());
    }
}
