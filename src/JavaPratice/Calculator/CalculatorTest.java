package JavaPratice.Calculator;


class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10,10));
        System.out.println(calculator.sub(10,10));
        System.out.println(calculator.multi(10,10));
        System.out.println(calculator.div(10,10));

        AbstractCalculator aCalculator = new AbstractCalculator(1,1);
        System.out.println("\n" + aCalculator.add());

    }
}