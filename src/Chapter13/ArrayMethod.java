package Chapter13;

public class ArrayMethod {
    static int sumOfAry(int[] ar) {

        int sum = 0;

        for(int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        return sum;
    }
    static int[]makeNewIntAry(int len) {

        int[] ar = new int[len];

        return ar;
    }
    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5, 6, 7};
        int sum = sumOfAry(ar);

    }
}
