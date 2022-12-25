package Chapter08;

public class Circle {

    final double PI;
    private double radius;

    Circle(double red) {

        radius = red;
        PI = 3.14;
    }

    public double getArea() {

        return (radius * 2) * PI;
    }
}
