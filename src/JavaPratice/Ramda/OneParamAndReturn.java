package JavaPratice.Ramda;

import java.util.function.Function;

public class OneParamAndReturn {

    public static void main(String[] args) {

        HowLong h1 = s -> s.length();
        System.out.println(h1.len("I am so happy"));

        Function<String, Integer> howLong = String::length;
        System.out.println(howLong.apply("I am so happy"));
    }

}
