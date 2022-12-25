package Chapter20;

import java.util.Random;

public class Randoms {

    public static void main(String[] args) {

        Random rand1 = new Random();     // 실행 할 때마다 다른 결과 출력
        for(int i = 0; i < 7; i++)
            System.out.println(rand1.nextInt(1000));

        Random rand2 = new Random(12);   // 실핼 할 때마다 같은 결과 출력
        for(int i = 0; i < 7; i++)
            System.out.println(rand2.nextInt(1000));

    }

}
