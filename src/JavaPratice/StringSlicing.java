package JavaPratice;

import java.util.Scanner;

public class StringSlicing {

    // "Hello.java" 문자열에서 파일명과 확장자인 java를 분리시키는 프로그램을 짜시오.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
//        String text = "Hello.java";  // text test
        String extension = " ";
        String filename = " ";
        boolean status = false;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '.') {
                status = true;
            } else if(status) {
                extension += input.charAt(i);
            }
            else {
                filename += input.charAt(i);
            }
        } System.out.println("파일이름은:" + filename + " 이며 확장자는" + extension + " 입니다.");
    }
}
