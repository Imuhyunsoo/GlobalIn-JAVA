package JavaPratice;

public class StarPrint {

    int num;

    public StarPrint() {

    }
    public StarPrint(int num) {

        this.num = num;
    }
    public void getPrint() {

        for(int i = 1; i <= this.num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } System.out.println();
        } System.out.println();
    }
    public void getPrint(int num) {

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } System.out.println();
        } System.out.println();
    }
}

