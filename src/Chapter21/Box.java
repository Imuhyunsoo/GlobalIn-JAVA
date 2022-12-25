package Chapter21;


/*
다음 상자는 사과도 오렌지도 담을 수 있다.
class Box {   // 무엇이든 저장하고 꺼낼 수 있는 상자

    private Object ob;

    public void set(Object o) {

        ob = o;
    }

    public Object get() {

        return ob;
    }

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
*/

public class Box<T> {

    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }

    public static void main(String[] args) {

        Box<Apple> aBox = new Box<Apple>();
        Box<Orange> oBox = new Box<Orange>();

        // 과일을 박스에 담은 것일까?
        aBox.set(new Apple());
        oBox.set(new Orange());

        // 박스에서 과일을 제대로 꺼낼 수 있을까?
        Apple ap = aBox.get();
        Orange og = oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }


}
