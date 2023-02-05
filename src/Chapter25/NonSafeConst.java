package Chapter25;

public class NonSafeConst {

    public static void main(String[] args) {

        who(Person.MAN);    // 정상적인 메소드 호출
        who(Animal.DOG);    // 비성장적인 메소드 호출

    }

    private static void who(int man) {

        switch (man) {

            case Person.MAN:
                System.out.println("남성 손님입니다.");
                break;
            case Person.WOMAN:
                System.out.println("여성 손님입니다.");
                break;
        }
    }
}
