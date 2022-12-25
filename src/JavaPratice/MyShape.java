package JavaPratice;

public class MyShape {

    public double getArea() {

        return 0;
    }
}
class MyCircle extends MyShape {

    private int r;

    public MyCircle(int i) {

        this.r = i;
    }

    @Override
    public String toString() {

        return "넓이는 " + (r * r * Math.PI) + " 입니다.";
    }
    @Override
    public double getArea() {

        return r * r * Math.PI;
    }
}

class MyTriangle extends MyShape {

    private int width, height;

    public MyTriangle(int width, int height) {

        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {

        return "넓이는 " + getArea() + " 입니다.";
    }
    @Override
    public double getArea() {

        return width * height / 2;
    }
}

class MyRectangle extends MyShape {

    private int width, height;

    public MyRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {

        return "넓이는 " + getArea() + " 입니다.";
    }
    @Override
    public double getArea() {

        return width * height;
    }

}

class MyShapeTest {

    public static void main(String[] args) {

        double sumArea = 0;

        MyShape[] shape = {new MyCircle(10),new MyTriangle(10, 10),new MyRectangle(10, 10)};

        for (MyShape s : shape) {
            sumArea += s.getArea();
            System.out.println(s);
        }

        System.out.println(sumArea);
    }
}