package Chapter15;

public class SmartPhone extends MobilePhone {

    private String androidVer;

    public SmartPhone(String num, String ver) {

        super(num);
        androidVer = ver;
    }
    public void playApp() {

        System.out.println("App is running in " + androidVer);
    }

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone("010-555-777", "Nougat");


        phone.answer();
        phone.playApp();
    }
}
