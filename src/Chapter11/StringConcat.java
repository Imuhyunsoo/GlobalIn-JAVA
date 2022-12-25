package Chapter11;

public class StringConcat {

    public static void main(String[] args) {

        // immutable 많이 어렵다 그러나, 어렵게 생각하지 말자. 원본 불편의 원칙이다.
        String st1 = "Coffee";
        String st2 = "Bread";

        String st3 = st1.concat(st2);
        System.out.println(st3);

        String st4 = "Fresh".concat(st3);
        System.out.println(st4);
    }
}
