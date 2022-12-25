package Chapter18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Throws {

    public static void main(String[] args) {

        try {
            md1();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void md1() throws IOException {

        md2();
    }

    // 내가 사용하고자 하는 함수에서 checked exception 던지면 무조건 받아서 예외처리를 해줘야함.
    public static void md2() throws IOException  {

        Path file = Paths.get("C:\\javaStudy\\Simple.txt");
        BufferedWriter writer = null;

        writer = Files.newBufferedWriter(file);
        writer.write('A');
        writer.write('Z');

        if(writer != null) {
            writer.close();
        }
    }
}


