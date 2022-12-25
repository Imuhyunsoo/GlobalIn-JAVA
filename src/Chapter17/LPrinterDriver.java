package Chapter17;

class LPrinterDriver implements Printable {

    @Override
    public void print(String doc) {

        System.out.println("From LG printer");
        System.out.println(doc);
    }

    @Override
    public void printLine(String str) {

    }

    @Override
    public String getContents() {
        return null;
    }

    public static void main(String[] args) {

        String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);
        System.out.println();

        // LG 프린터로 출력
        prn = new LPrinterDriver();
        prn.print(myDoc);
    }

}

