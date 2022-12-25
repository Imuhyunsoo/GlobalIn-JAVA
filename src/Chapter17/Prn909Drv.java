package Chapter17;

class Prn909Drv implements ColorPrintable {

    @Override
    public void print(String doc) {   // 흑백 출력
        System.out.println("black & white ver");
        System.out.println(doc);
    }

    @Override
    public void printLine(String str) {

    }

    @Override
    public String getContents() {
        return null;
    }

    @Override
    public void printCMYK(String doc) {   // 컬러 출력
        System.out.println("CMYK ver");
        System.out.println(doc);
    }
}
