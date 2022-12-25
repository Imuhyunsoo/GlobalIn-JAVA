package Chapter13;

class Box {

    private String conts;
    private int num;

    Box(String cont) {

        this.conts = cont;
    }

    Box(int num, String str) {

        this.num = num;
        this.conts = str;
    }

    public String toString(){

        return conts;
    }

    public int getBoxNum() {

        return num;
    }
}
