package JavaPratice.Gambling;

import java.util.Scanner;

class Player {

    private String name;
    Scanner scanner = new Scanner(System.in);

    public void setInput(String numberStr) {

        System.out.print(numberStr + "目のプレーヤの名前を入力してください。");
        this.name = scanner.nextLine();
    }
    public String setName() {

        return name;
    }
}