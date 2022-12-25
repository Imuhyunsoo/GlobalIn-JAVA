package JavaPratice;

import java.util.Random;

//행 크기 :5
//        열 크기 :3
//        N B A
//        O S O
//        B Z M
//        S O R
//        B E D

class IArray {

    public static void main(String[] args) {

        char[][] array = new char[5][3];
        Random random = new Random();

        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (char)(random.nextInt(26) +65);
                System.out.print(array[i][j]);
            } System.out.println();
        }

    }
}