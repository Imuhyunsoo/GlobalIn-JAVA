package Chapter11;

public class BuildString {

    public static void main(String[] args) {

        StringBuilder stbuf = new StringBuilder("123");

        stbuf.append(45678);
        System.out.println(stbuf.toString()); // 12345678

        stbuf.delete(0,2);
        System.out.println(stbuf.toString()); // 345678

        stbuf.replace(0,3, "AB");
        System.out.println(stbuf.toString()); //AB678

        stbuf.reverse();
        System.out.println(stbuf.toString()); //876BA

        String sub = stbuf.substring(2,4); // 6B
        System.out.println(sub);
    }
}
