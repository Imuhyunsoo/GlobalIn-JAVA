package JavaPratice;

import java.util.Random;
import java.util.Scanner;

//9. 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
//        “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//        크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//        (char 형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)

class InputArray {

    public static void main(String[] args) {

        int row;
        int col;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.println("행크기: ");
            row = scanner.nextInt();
            if(!(row > 1 && row < 10)) {
                row = 0;
                System.out.println("다시 입력해주세요.");
            }
            else {
                break;
            }
        } while(true);
        do {
            System.out.println("열크기: ");
            col = scanner.nextInt();
            if(!(col > 1 && col < 10)) {
                col = 0;
                System.out.println("다시 입력해주세요.");
            }
            else {
                break;
            }
        } while(true);

        char[][] array = new char[row][col];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (char)(random.nextInt(26)+65);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



