package Chapter17;

class SPrinterDriver implements Printable {

    @Override
    public void print(String doc) {

        System.out.println("From Samsung printer");
        System.out.println(doc);
    }

    @Override
    public void printLine(String str) {

    }

    @Override
    public String getContents() {
        return null;
    }
}

