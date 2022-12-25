package JavaPratice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Coffee {

    public static void main(String[] args) {

        HashMap<String, Integer> coffee = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean state = true;

        coffee.put("에스프레소", 1000);
        coffee.put("아메리카노", 2500);
        coffee.put("카푸치노", 3000);
        coffee.put("카페라떼", 1000);

        Set<String> menu = coffee.keySet();

        for(String str : menu)
            System.out.print(str.toString() + ",");
        System.out.println('\f' + "있습니다.");

        while(state) {
            System.out.print("주문 >> ");
            String input = scanner.nextLine();
            switch (input) {
                case "에스프레소":
                    System.out.println("에스프레소는 " + coffee.get(input) + "원 입니다.");
                    break;
                case "아메리카노":
                    System.out.println("아메리카노 " + coffee.get(input) + "원 입니다.");
                    break;
                case "카푸치노":
                    System.out.println("카푸치노 " + coffee.get(input) + "원 입니다.");
                    break;
                case "카페라떼":
                    System.out.println("카페라떼 " + coffee.get(input) + "원 입니다.");
                    break;
                case "그만" : state = false; break;
            }
        }
    }
}
