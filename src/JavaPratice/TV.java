package JavaPratice;

public class TV {

    int inchi;
    int nen;
    String kaisya;

    public TV(String kaisya, int nen, int inchi){

        this.inchi=inchi;
        this.kaisya=kaisya;
        this.nen=nen;
    }
    public void show(){

        System.out.println(kaisya + "에서 만든 " + nen + "년형 " + inchi + "인치");
    }
}
