package Chapter18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Finally {

    public static void main(String[] args) {

        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;
        try {
            writer = Files.newBufferedWriter(file);   // IOException 발생 가능
            writer.write('A');   // IOException 발생 가능
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(writer != null)
                    writer.close();    // IOException 발생 가능
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
