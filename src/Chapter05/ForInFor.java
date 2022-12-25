package Chapter05;

public class ForInFor {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {    // 바깥쪽 for 문
            System.out.println("--------------------");
            for(int j = 0; j < 3; j++) {    // 안쪽 for 문
                System.out.print("[" + i + ", " + j + "] ");
            }
            System.out.print('\n');
        }
    }
}
