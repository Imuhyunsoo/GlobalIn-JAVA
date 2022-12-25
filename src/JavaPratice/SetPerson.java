package JavaPratice;


/* 8.아래와 같이 출력되도록 하시오.
        HashSet<Person> hSet = new HashSet<Person>();
        hSet.add(new Person("LEE", 10));
        hSet.add(new Person("LEE", 10));
        hSet.add(new Person("PARK", 35));
        hSet.add(new Person("PARK", 35));

        System.onut.println("저장된 데이터 수: " + hSet.size());
        System.out.println(hSet); */
/*
============
저장된 데이터 수: 2
[LEE(10세), PARK(35세)]
*/
import java.util.HashSet;

public class SetPerson {

    private String name;
    private int age;

    public SetPerson(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {

        return age;
    }
    @Override
    public boolean equals(Object obj) {

        if(this.age == ((SetPerson) obj).age && this.name == ((SetPerson) obj).name) {
            return true;
        }
        return false;
    }

    public String toString() {

        return name + " (" + age + "세)";
    }
}

class SetPersonTest {

    public static void main(String[] args) {

        HashSet<SetPerson> hSet = new HashSet<SetPerson>();
        hSet.add(new SetPerson("LEE", 10));
        hSet.add(new SetPerson("LEE", 10));
        hSet.add(new SetPerson("PARK", 35));
        hSet.add(new SetPerson("PARK", 35));

        System.out.println("저장된 데이터 수: " + hSet.size());
        System.out.println(hSet);
    }
}
