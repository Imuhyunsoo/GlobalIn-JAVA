package JavaPratice;

/* 6. 출력이 아래와 같이 나오도록 하시오(필수) ⭐️
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
        System.out.print(n.toString() + '\t');

        System.out.println(); */

import java.util.HashSet;

/*
====출력
인스턴스 수: 2
7799	9955
*/
public class Num {
    private int num;

    public Num(int num) {

        this.num = num;
    }
//    @Override
//    public hashCode(int num) {
//        return num % 3;
//    }

    @Override
    public boolean equals(Object obj) {

        if(this.num == ((Num)obj).num) {
            return true;
        } return false;
    }

}
class NumTest {

    public static void main(String[] args) {

        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
    }
}
