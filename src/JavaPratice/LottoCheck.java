package JavaPratice;

import java.util.Random;

public class LottoCheck {

    public static void main(String[] args) {

        Random random = new Random();
        int[] lotto = new int[6];

        for(int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45);

            for(int j = 0; j<i; j++) {
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i]);
        }
    }
}
