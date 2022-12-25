package JavaPratice;

public class Man {

    private String name;

    public Man(String name) {

        this.name = name;
    }

    public void tellYourName() {

        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man {

    private String company;
    private String position;

    public BusinessMan(String name, String company, String position) {

        super(name); //  부모 생성자를 슈퍼로 꺼내와서 초기화
        this.company = company;
        this.position = position;

    }

    public void tellYourInfo() {

        System.out.println("My company is " + company);
        System.out.println("My position is" + position);
        tellYourName();
    }
}
class MyBusinessMan {

    public static void main(String[] args) {

        BusinessMan man = new BusinessMan("花子","Hybrid ELD", "Staff Eng");
        man.tellYourInfo();
    }
}
