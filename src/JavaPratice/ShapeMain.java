package JavaPratice;

/* 6. 다음은 도형 구성을 묘사하는 인터페이스이다.
interface Shape {
    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드

    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw() { // 디폴트 메소드
        System.out.print("--- 다시 그립니다.");
        draw();
    }
}
    다음 main() 메소드와 실행 결과를 참고하여, 인터페이스 Shape을 구현한 클래스 Circle를 작성하고 전체 프로그램을 완성하라.
public class ShapeMain {
    public static void main(String[] args) {
        Shape donut = new Circle(10); // 반지름이 10인 원 객체
        donut.redraw();
        System.out.println("면적은 "+ donut.getArea());
    }
} */

interface Shape {

    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드

    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw() { // 디폴트 메소드
        System.out.print("--- 다시 그립니다.");
        draw();
    }
}
class Circle implements Shape {

    private int r;

    public Circle(int num) {

        this.r = num;
    }

    @Override
    public void draw() {

        System.out.println("반지름이 " + r + "인 원 입니다.");

    }

    @Override
    public double getArea() {

        return r * r * PI;
    }
}

class Oval implements Shape {

    private int yoko;
    private int tate;

    public Oval(int yoko, int tate) {

        this.yoko = yoko;
        this.tate = tate;
    }

    @Override
    public void draw() {

        System.out.println(yoko + "x" + tate + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {

        return PI * yoko * tate;
    }
}

class Rect implements Shape {

    private int yoko;
    private int tate;

    public Rect(int yoko, int tate) {
        this.yoko = yoko;
        this.tate = tate;
    }

    @Override
    public void draw() {

        System.out.println(yoko + "x" + tate + "크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {

        return yoko * tate;
    }
}
/*
7.다음 main() 메소드와 실행 결과를 참고하여,
        문제 6의 Shape 인터페이스를 구현한 클래스 Oval, Rect를 추가 작성하고 전체 프로그램을 완성하라.

public static void main(String[] args) {
        Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
        list[0] = new Circle(10); // 반지름이 10인 원 객체
        list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
        list[2] = new Rect(10, 40); // 10x40 크기의 사각형
        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
        }
*/

/*
--- 다시 그립니다.반지름이 10인 원입니다.
--- 다시 그립니다.20x30에 내접하는 타원입니다.
--- 다시 그립니다.10x40크기의 사각형 입니다.
면적은 314.0
면적은 1884.0000000000002
면적은 400.0
*/
public class ShapeMain {

    public static void main(String[] args) {

       /* Shape donut = new Circle1(10); // 반지름이 10인 원 객체
        donut.redraw();
        System.out.println("면적은 "+ donut.getArea()); */

        Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
        list[0] = new Circle(10); // 반지름이 10인 원 객체
        list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
        list[2] = new Rect(10, 40); // 10x40 크기의 사각형

        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
    }

}