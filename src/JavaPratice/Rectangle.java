package JavaPratice;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void show() {

        System.out.println("X 좌표 : "+ this.x + " Y 좌표 : " + this.y);
        System.out.println("넓이 : " + square());
    }
    int square() {

        return width * height;
    }
    boolean contains(Rectangle r) {

        boolean mondai = false;
        if((this.x < r.x)&&(this.y < r.y)) {
            if((this.width + this.x > r.width + r.x)&&(this.height + this.y  > r.height + r.y)) {
                mondai = true;
            }
        }
        return mondai;
    }

    boolean containsSense(Rectangle r) {

        if( (this.x < r.x) &&
                ((this.x + this.width) > (r.x + r.width)) &&
                (this.y < r.y) &&
                ((this.y + this.height) > (r.y + r.height)) ) {
            return true;
        } return false;
    }
}
class RectangleTest {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if (t.containsSense(r)) System.out.println("t는 r을 포함합니다.");
        if (t.containsSense(s)) System.out.println("t는 s를 포함합니다.");
    }
}