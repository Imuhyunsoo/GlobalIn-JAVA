package JavaPratice;

/* 1. 다음을 만족하는 클래스 Employee를 작성하시오
- 클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
- 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력 */

public class Employee {

    private String name;
    private int age;
    private String address;
    private String department;
    private int salary;

    protected Employee(String name, int age, String address, String department) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
    }

    protected void setSalary(int salary) {

        this.salary = salary;
    }

    protected int getSalary() {

        return salary;
    }

    public void printInfo() {

        System.out.println("名前：" + name);
        System.out.println("年：" + age);
        System.out.println("住所：" + address);
        System.out.println("部署：" + department);
    }
}
/* 2. 다음을 만족하는 클래스 Regular를 작성하시오.
- 클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
- Setter : 월급 정보 필드를 지정
- 메소드 printInfo() : 인자는 없고 "정규직"이라는 정보와 월급을 출력 */

class Regular extends Employee {

    private String position;

    public Regular(String name, int age, String address, String department) {

        super(name, age, address, department);
        this.position = "正規職";
    }

    public void setSalary(int salary) {

        super.setSalary(salary);
    }

    public void printInfo() {

        System.out.println("職位：" + this.position);
        System.out.println("給料：" + super.getSalary() + "円");

    }
}
/* 3. 다음을 만족하는 클래스 Temporary를 작성하시오.
- 클래스 Temporary는 위 클래스 Employee의 하위 클래스
- 필드 : 일한 시간, 시간당 보수를 선언하고 시간당 보수의 초기 값으로 10000 저장
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
- Setter : 일한 시간을 지정하면서 급여를 일한 시간 * 시간당 보수로 계산하여 저장
- 메소드 printInfo() : 인자는 없고 "비정규직"이라는 정보와 일한 시간과 급여를 출력
- 또한 다음 프로그램으로 클래스 Employee, Regular, Temporary를 점검하는 프로그램 실행 */

class Temporary extends Employee {

    private int totalWork;
    private int hourlyPay = 1000;
    private String position;

    public Temporary(String name, int age, String address, String department) {

        super(name, age, address, department);
        this.position = "不正規職";
    }

    public int totalSalary(int hour) {

        this.totalWork = hour;
        return totalWork * hourlyPay;
    }

    public int totalSalary() {

        return totalWork * hourlyPay;
    }

    public void printInfo() {

        System.out.println("職位：" + this.position);
        System.out.println("勤務時間：" + totalWork + "時間");
        System.out.println("給料：" + "￥ " + totalSalary());
    }
}

class EmployeeTest {

    public static void main(String[] args) {

//        Employee employee = new Employee("太郎", 19, "東京都新宿区","開発１チーム");
//        employee.printInfo(); //　親クラスのテスト

//        Regular tarou = new Regular("太郎", 19, "東京都新宿区", "開発１チーム");
//        tarou.setSalary(10000);
//        tarou.printInfo(); //　子クラスのテスト

        Temporary hanako = new Temporary("花子", 19, "東京都新宿区", "開発１チーム");
        hanako.totalSalary(120);
        hanako.printInfo();

    }
}

