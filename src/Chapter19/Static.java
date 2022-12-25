package Chapter19;

public class Static {

    public static void main(String[ ] args) {

        int num1 = 10;
        int num2 = 20;
        adder(num1, num2);
        System.out.println("end of program");
    }

    public static void adder(int n1, int n2) {

        int result = n1 + n2;

        System.out.println(result);

        // return result;
    }

}
