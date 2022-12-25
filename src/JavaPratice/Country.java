package JavaPratice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Country {

    public static void main(String[] args) {

        HashMap<String, Integer> country = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String[] input;

        try {
            System.out.println("国家名と人口を５つ入力して下さい。");
            for(int i = 0; i < 5; i++) {
                System.out.print("国の名、人口 >> ");
                input = scanner.nextLine().split(" ");
                country.put(input[0], Integer.parseInt(input[1]));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("間違った入力です。");
            System.out.println("プログラムを終了します。");
            return;
        }

        Set<String> kuni = country.keySet();
        int max = 0;
        String maxCountry = null;

        for(String str : kuni) {
            if(max < (country.get(str))) {
                maxCountry = str.toString();
                max = country.get(str);
            }
        }
        System.out.println("一番人口が多い国は(" + maxCountry + ", " + country.get(maxCountry) + ")です。");

    }
}
