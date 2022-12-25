package Chapter16;

public class UnivFriend {

    private String name;
    private String major;
    private String phone;

    public UnivFriend(String name, String major, String phone) {

        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public void showInfo() {

        System.out.println("이름 : " + name);
        System.out.println("전공 : " + major);
        System.out.println("전화 : " + phone);

    }
}
