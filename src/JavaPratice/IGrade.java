package JavaPratice;

public class IGrade {

    private int math;
    private int eng;
    private int science;

    public IGrade(int math, int eng, int science) {

        this.math = math;
        this.eng = eng;
        this.science = science;
    }
    public int average() {

        return (math+eng+science)/3;
    }
}
