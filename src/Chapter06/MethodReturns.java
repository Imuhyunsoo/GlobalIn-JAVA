package Chapter06;

public class MethodReturns {

    // void : 값을 반환하지 않음을 의미
    public static void main(String[] args) {
        int result;
        result = adder(4, 5);
        System.out.println("4 + 5 = " + result);
        System.out.println("3.5 x 3.5 = " +square(3.5));
    }


    public static int adder(int num1, int num2) {
        int addResult = num1 + num2;
        return addResult;   // return : 값의 반환을 명령
    }

    public static double square(double num) {
        return num * num;
    }
}
