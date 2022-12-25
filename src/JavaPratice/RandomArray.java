package JavaPratice;

import java.util.Random;

public class RandomArray {

    // 4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
    public static void main(String[] args) {

        int[][] array = new int[4][4];

        Random random = new Random();

        for(int row = 0; row < array.length; row++) {
            for(int col = 0; col < array[row].length; col++) {
                array[row][col] = random.nextInt(10);
                System.out.print(array[row][col] + "\t");
            } System.out.println();
        }

    }
}
