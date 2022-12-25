package JavaPratice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSet {

    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> lotto = new HashSet<>();

        for (int i = 1; i < 46; i++) {
            lotto.add(random.nextInt(45));
        } for (int i = 0; i < 6; i++)
            System.out.print(lotto);

    }
}
