package JavaPratice;

/* 5. IO 스트림을 이용하여 아래와 같이 프로그램을 완성하시오.
        =================
        대상 파일: a.java
        사본 이름: x:\b.java
        파일 복사가 되었습니다. */

import java.io.*;
import java.util.Scanner;

public class IOCopy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("대상 파일: ");
        String src = scanner.nextLine();
        System.out.print("사본 이름: ");
        String dst = scanner.nextLine();

        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst);) {

            byte buf[] = new byte[1024];
            int len;

            while(true) {
                len = in.read(buf);

                if(len == -1) {
                    break;
                }
                out.write(buf, 0, len);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
