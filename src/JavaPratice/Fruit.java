package JavaPratice;

abstract public class Fruit {

    abstract public void print();
}
class  Grape extends Fruit {

    @Override
    public void print() {
        System.out.println("나는 포도이다.");
    }
}
class Apple extends Fruit {

    @Override
    public void print() {
        System.out.println("나는 사과이다.");
    }
}
class Pear extends Fruit {

    @Override
    public void print() {
        System.out.println("나는 배이다.");
    }
}

/* 다음을 프로그래밍 하시오.
   - 소스
   Fruit fAry[] = {new Grape(), new Apple(), new Pear());
   for(Fruit f : fAry)
   f.print();

   - 결과
   나는 포도이다.
   나는 사과이다.
   나는 배이다. */
class FruitTest {

    public static void main(String[] args) {

        Fruit fAry[] = { new Grape(), new Apple(), new Pear() };
        for(Fruit f : fAry)
            f.print();
    }
}