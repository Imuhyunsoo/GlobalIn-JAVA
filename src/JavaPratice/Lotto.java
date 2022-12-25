package JavaPratice;

import java.util.Random;

public class Lotto {

    int[] lotto = new int[6];
    Random random = new Random();

    public void draw() {  // 재추첨 함수
        int check;

        for (int i = 0; i < lotto.length; i++) {

            while (true) {
                check = random.nextInt(45);
                if (!isContain(lotto, check)) {
                    this.lotto[i] = check;
                    break;
                }
            }
        }
        lottoPrint(this.lotto);
    }

    public void lottoPrint(int[] lotto) {  // 출력

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }

    public boolean isContain(int[] arr, int a) {  // 중복 체크 함수

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }
}

class LottoTest {

    public static void main(String[] args) {

        Lotto lotto = new Lotto();
        lotto.draw();
    }
}
