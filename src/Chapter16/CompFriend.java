package Chapter16;

public class CompFriend {

    private String name;
    private String department;
    private String phone;

    public CompFriend(String name, String department, String phone) {

        this.name = name;
        this.department = department;
        this.phone = phone;
    }

    public void showInfo() {

        System.out.println("이름 : " + name);
        System.out.println("부서 : " + department);
        System.out.println("전화 : " + phone);

    }

    public static void main(String[] args) {
        UnivFriend[] ufrns = new UnivFriend[5];
        int ucnt = 0;

        CompFriend[] cfrns = new CompFriend[5];
        int ccnt = 0;

        ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
        ufrns[ucnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");

        cfrns[ccnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
        cfrns[ccnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

        for(int i = 0; i < ucnt; i++) {
            ufrns[i].showInfo();
            System.out.println();
        }

        for(int i = 0; i < ccnt; i++) {
            cfrns[i].showInfo();
            System.out.println();
        }
    }
}
