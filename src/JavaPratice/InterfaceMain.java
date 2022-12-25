package JavaPratice;

// 예전에는 무조건이였는데, 요즘은 기본적으로 함수 선언(추상 함수)과 상수 올수 있다. 구현부(바디)가 있으면 안됨
// 함수 구현부가 없는 부분은 컴파일러가 public abstract 를 자동으로 생성됨
// abstract =  interface = 자손이 구현(implements)하라.
interface Printable {

    public final double PI = 3.14;
    public abstract void print(String doc);

    default void printCMYK(String doc) {

        System.out.println("프린트");
    };
}
// 삼성 제조사
class SPrinterDriver implements Printable {

    @Override
    public void print(String doc) {

        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}
// LG 제조사
class LPrinterDriver implements Printable {

    @Override
    public void print(String doc) {

        System.out.println("From LG printer");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {

        System.out.println("컬러 프린트 구현 성공");
    }
}

class Prn909Drv implements Printable {

    @Override
    public void print(String doc) {

        System.out.println("흑백 프린트 지원");
    }

    public void printCMYK(String doc) {

        System.out.println("컬러 프린트 지원");
    }
}


public class InterfaceMain {

    public static void main(String[] args) {

        String myDoc = "This is a report about...";

        //샘숭이
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);
        System.out.println();

        prn = new LPrinterDriver();
        prn.print(myDoc);

        prn = new Prn909Drv();
        prn.print(myDoc);
        prn.printCMYK(myDoc);

    }
}
