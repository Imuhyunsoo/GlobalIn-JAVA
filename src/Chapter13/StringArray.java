package Chapter13;

public class StringArray {

    public static void main(String[] args) {

        String[] sr = new String[7];
        sr[0] = new String("Java");
        sr[1] = new String("System");
        sr[2] = new String("Compiler");
        sr[3] = new String("Pack");
        sr[4] = new String("Tree");
        sr[5] = new String("Dinner");
        sr[6] = new String("Brunch Cafe");

        int total = 0;
        for (int i = 0; i < sr.length; i++) {
            total += sr[i].length();
        }

        int cnum = 0;
        for(String string : sr) {
            cnum += string.length();
        }

        System.out.println("총 문자의 수 : " + total);
        System.out.println("총 문자의 수 : " + cnum);

    }
}
