package JavaPratice;

/* 5.이름과 학점(4.5만점)을 5개 입력받아 해시맵에 저장하고, 장학생 선발 기준을 입력받아 장학생 명단을 출력하라.

        이름과 학점>> 강나래 3.1
        이름과 학점>> 니보라 3.3
        이름과 학점>> 강하늘 4.3
        이름과 학점>> 울나리 4.0
        이름과 학점>> 그만해 3.7
        장학생 선발 학점 기준 입력>> 3.2
        장학생 명단: 그만해 강하늘 니보라 울나리 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ScholarShip {

    public static void main(String[] args) {

        HashMap<String, Double> student = new HashMap<>();
        String[] input;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점 >> ");
            input = scanner.nextLine().split(" ");
            student.put(input[0], Double.parseDouble(input[1]));
        }
        System.out.print("장학생 선발 학점 기준 입력 >> ");
        double credit = scanner.nextDouble();

        Set<String> key = student.keySet();

        System.out.print("장학생 명단: ");
        for (String str : key) {
            if (student.get(str) >= credit) {
                System.out.print(str + " ");
            }
        }
    }
}
