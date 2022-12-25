package Chapter21;

public class DBox<String, Integer> {

    private String Fruit;
    private Integer number;

    public void set(String string, Integer integer) {

        Fruit = string;
        number = integer;
    }

    @Override
    public java.lang.String toString() {

        return Fruit + " & " + number;
    }

}