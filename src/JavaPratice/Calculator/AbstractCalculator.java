package JavaPratice.Calculator;

class AbstractCalculator extends ACalculator {

    public AbstractCalculator (int num1, int num2) {

        super(num1,num2);
    }

    public int add() {

        return num1 + num2;
    }

}