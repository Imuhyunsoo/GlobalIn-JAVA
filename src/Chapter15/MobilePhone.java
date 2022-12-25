package Chapter15;

public class MobilePhone {

    protected String number;

    public MobilePhone(String num) {

        number = num;
    }

    public void answer() {

        System.out.println("HI~from " + number);
    }
}
