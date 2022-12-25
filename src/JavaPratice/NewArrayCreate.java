package JavaPratice;

public class NewArrayCreate {
    private int[][] ary;
    private int count = 0;

    public NewArrayCreate() {}

    public NewArrayCreate(int row, int col) {
        int[][] array = new int[row][col];
        this.ary = array;
    }

    public void createArray(int startNum) {
        this.count = startNum;

        for (int row = 0; row < ary.length; row++) {
            for (int col = 0; col < ary[row].length; col++) {
                ary[row][col] = ++count;
                System.out.print(ary[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
