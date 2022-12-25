package Chapter21;

public class FruitAndBox {

    public static void main(String[] args) {
        Box aBox = new Box();    // 상자 생성
        Box oBox = new Box();    // 상자 생성

        aBox.set(new Apple());    // 상자에 사과를 담는다.
        oBox.set(new Orange());   // 상자에 오렌지를 담는다.

        Apple ap = (Apple)aBox.get();    // 상자에서 사과를 꺼낸다.
        Orange og = (Orange)oBox.get();   // 상자에서 오렌지를 꺼낸다.

        System.out.println(ap);
        System.out.println(og);
    }

}
