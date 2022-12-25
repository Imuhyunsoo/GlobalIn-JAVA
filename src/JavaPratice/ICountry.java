package JavaPratice;

/* 1.  아래를 작성 하시오.프로그래밍
        나라 이름과 인구를 입력하세요.(예: Korea 5000)
        나라 이름, 인구 >> Korea 5000
        나라 이름, 인구 >> USA 1000000
        나라 이름, 인구 >> Swiss 2000
        나라 이름, 인구 >> France 3000
        나라 이름, 인구 >> 그만

        인구 검색 >> France
        France의 인구는 3000
        인구 검색 >> 스위스
        스위스 나라는 없습니다.
        인구 검색 >> 그만 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ICountry {

    public static void main(String[] args) {

        Map<String, Integer> country = new HashMap<>();
        String[] input = new String[2];
        String kuni = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

        while (true) {
            System.out.print("나라 이름, 인구 >>");
            input = scanner.nextLine().split(" ");
            if (input[0].equals("그만")) {
                break;
            }
            country.put(input[0], Integer.parseInt(input[1]));
        }
        while (true) {
            System.out.print("인구 검색 >>");
            kuni = scanner.nextLine();
            if (kuni.equals("그만")) {
                break;
            }
            else if (country.get(kuni) == null) {
                System.out.println(kuni + " 나라는 없습니다." );
            }
            else {
                System.out.println(kuni + "의 인구는 " + country.get(kuni));
            }


            /* if(country.containsKey(kuni)) {
                System.out.println(kuni + "의 인구는 " + country.get(kuni));
            }
            else {
                System.out.println(kuni + " 나라는 없습니다." );
            } */
        }
    }
}
