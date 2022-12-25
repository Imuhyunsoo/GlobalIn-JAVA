package Network;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAddressEx {

    Scanner scanner;

    public InetAddressEx() {

        System.out.println("Host 이름을 입력 하세요.");

        scanner = new Scanner(System.in);
        try {
            InetAddress inetAdress = InetAddress.getByName(scanner.next());

            System.out.println("Computer Name : " + inetAdress.getHostName());
            System.out.println("Coumper IP : " + inetAdress.getHostAddress());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

