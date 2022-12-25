package Chapter32;

import java.io.*;
import java.util.Scanner;

public class StringReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("읽을 파일: ");
        String filename = scanner.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String input;

            while(true) {
                input = reader.readLine();

                if(input == null) {
                    break;
                }
                System.out.println(input);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

