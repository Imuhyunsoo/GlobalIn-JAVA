package JavaPratice;

public class ArrayMethod {

    static int arraySum(int [] ar) {

        int sum = 0;
        for (int e : ar) {
            sum += e;
        } return sum;
    }

    public static void main(String[] args) {

        int [] ar = {1, 2, 3, 4, 5};
        System.out.println("sum = " + arraySum(ar));
    }
}

