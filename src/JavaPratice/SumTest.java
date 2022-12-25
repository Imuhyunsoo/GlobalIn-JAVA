package JavaPratice;

public class SumTest {
    int total;

    public int sum(int num) {

        for (int i = 1; i <= num; i++) {
                total += i;
        } return total;
    }

    public int getTotal() {

        return total;
    }

    public void setTotal(int total) {

        this.total = total;
    }
}
