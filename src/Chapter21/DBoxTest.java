package Chapter21;

public class DBoxTest {

    public static void main(String[] args) {

        DBox<String, Integer> box = new DBox<String, Integer>();

        box.set("Apple", 25);

        System.out.println(box);
    }
}
