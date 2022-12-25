package JavaPratice;

public class StringSlicingSense {

    public static void main(String[] args) {

        String word = "Hello.java";

        int index = word.indexOf(".");
        System.out.println(index);

        String filename = word.substring(0,index);
        System.out.println(filename);

        String extention = word.substring(index+1);
        System.out.println(extention);
    }
}
