package Chapter32;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Write7ToFile2 {

    public static void main(String[] args) throws IOException {

        InputStream in = null;
        try{
            in = new FileInputStream("data.dat");
            int dat = in.read();
            System.out.println(dat);
        }
        finally {
            if(in != null)  // 입력 스트림 생성 성공했다면, 끝낸다.
                in.close();
        }
    }
}
