package Chapter32;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {
    public static void main(String[] args) {
        String kr = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
        String es = "Life is long if you know now to use it.";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {
            bw.write(kr, 0, kr.length());
            bw.newLine();
            bw.write(es, 0, es.length());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
