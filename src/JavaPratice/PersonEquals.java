package JavaPratice;

//1.  다음 조건을 만족하는 클래스 Person을 구현하여 테스트하는 프로그램을 작성하시오.(필수) ⭐️
//
//        - 클래스 Person은 이름을 저장하는 필드 구성
//        - 클래스 Person은 상위 클래스 Object의 메소드 equals()를 오버라이딩하여 이름이 같으면 true를 반환하는 메소드 구현
//        - 다음과 같은 소스로 클래스 Person을 점검
//
//        Person p1 = new Person("홍길동");
//        System.out.println(p1.equals(new Person("홍길동")));
//        System.out.println(p1.equals(new Person("최명태")));

public class PersonEquals {

    private String name;

    public PersonEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof PersonEquals) {
            PersonEquals you = (PersonEquals)obj;
            if(this.name == you.name) {
                return true;
            }
        }

//        if(this.name == ((PersonEquals)obj).name) {
//            return true; }
        return false;
    }
}

class PersonTest {

    public static void main(String[] args) {

        PersonEquals p1 = new PersonEquals("홍길동");
        System.out.println(p1.equals(new PersonEquals("홍길동")));
        System.out.println(p1.equals(new PersonEquals("최명태")));
    }
}