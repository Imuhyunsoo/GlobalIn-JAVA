package Chapter10;

class ClassVarAccess {

    public static void main(String[] args) {

        AccessWay way = new AccessWay();
        way.num++;
        AccessWay.num++;
        System.out.println("num = " + AccessWay.num);
    }
}
