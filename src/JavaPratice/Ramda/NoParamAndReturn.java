package JavaPratice.Ramda;

import java.util.Random;
import java.util.function.Supplier;

public class NoParamAndReturn {

    public static void main(String[] args) {

        Generator gen = () -> {
            Random rand = new Random();
            return rand.nextInt(50);
        };

        System.out.println(gen.rand());

        Supplier<Integer> rand = () -> new Random().nextInt(50);
        System.out.println(rand.get());
    }
}
