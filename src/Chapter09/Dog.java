package Chapter09;

public class Dog {

    public void makeCat() {

        Cat yaong = new Cat();
    }

    public void makeDuck() {

        Duck quack = new Duck();
    }

    public void welcome(Cat c) {

        c.makeSound();

        c.makeHappy();
    }
}
