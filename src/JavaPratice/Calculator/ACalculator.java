package JavaPratice.Calculator;

abstract class ACalculator {

    protected int num1, num2;

    public ACalculator(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract int add();
}
