package JavaPratice;


/* 3. Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력 받아 저장(List)하고 검색하여
        가장 큰 수를 출력하는 프로그램을 작성하라. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListToBigger {

    public static void main(String[] args) {

        int big = 0;
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("비교할 숫자를 입력하세요. (-1 입력시 비교 시작)");
            int num = scanner.nextInt();
            if(num == -1){
                for (Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
                    if(big < itr.next()) {
                        big = itr.next();
                    }
                }
                System.out.println("가장 큰 수 : " + big);
                break;
            }
            list.add(num);
        }
    }
}
