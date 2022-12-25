package JavaPratice;

public class Grade {

    private int eng;
    private int math;
    private int sic;
    private int avg;

    Grade(int math, int sic, int eng) {

        this.eng = eng;
        this.math = math;
        this.sic = sic;
    }

    int average() {

        avg = (eng+math+sic)/3;
        return avg;
    }

    String getGrade() {

        if(avg >= 90) {
            return "수";
        } else if (avg >= 80) {
            return "우";
        } else if (avg >= 70) {
            return "미";
        } else if (avg >= 60) {
            return "양";
        } else {
            return "미";
        }
    }
}
