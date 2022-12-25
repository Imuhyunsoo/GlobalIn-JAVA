package Chapter15;

class CheeseCake extends Cake {
    public void milky() {

        System.out.println("ミルキ");
    }

    @Override
    public void yummy() {

        System.out.println("Yummy cheese cake");
    }

    public static void main(String[] args) {

        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
        c2.yummy();
    }
}
