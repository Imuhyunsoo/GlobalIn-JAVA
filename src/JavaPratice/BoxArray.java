package JavaPratice;

import java.util.Random;

public class BoxArray {

    public static void main(String[] args) {

        int [] arrLotto = makeLotto();

        for (int num : arrLotto) {
            System.out.println(num);
        }

//        Box1[] ar = new Box1[3];
//
//        ar[0] = new Box1("First");
//        ar[1] = null;
//        ar[2] = new Box1("Third");
    }

    private static int[] makeLotto() {

        int[] aryLotto = new int[5];
        Random random = new Random();

        for(int i = 0; i < aryLotto.length; i++) {
            aryLotto[i] = random.nextInt(45);
            for (int j = 0; j < i; j++) {
                if(aryLotto[j] == aryLotto[i]) {
                    i--;
                }
            }

        } return aryLotto;
    }
}
