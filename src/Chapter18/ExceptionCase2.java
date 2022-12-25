package Chapter18;

import java.util.Scanner;

public class ExceptionCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("a/b..a?");
            int n1 = scanner.nextInt();
            System.out.println("a/b..b?");
            int n2 = scanner.nextInt();
            System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Good bye~~!");
        }
    }
}
