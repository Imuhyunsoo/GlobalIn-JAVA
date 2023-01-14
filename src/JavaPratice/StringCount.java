package JavaPratice;
import java.util.*;
public class StringCount {

    Scanner scanner = new Scanner(System.in);

    private int mo = 0;
    private int ja = 0;
    String input() {

        System.out.println("단어를 입력하시오");
        String input = scanner.nextLine();
        return input;
    }
    void check(String str) {

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                mo++;
            }
            else {
                ja++;
            }
        }
        System.out.println("모음이 [" + mo + "] 개 자음이 [" + ja + "] 발견되었습니다.");
    }
    void start() {

        check(input());
    }
}
class StringCountTest {

    public static void main(String[] args) {

        StringCount strCheck = new StringCount();
        strCheck.start();
    }
}