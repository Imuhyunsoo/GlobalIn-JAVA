package Chapter17;

public class SimplePrinter implements Printable {

    public void printLine(String str) {

        System.out.println(str);
    }

    @Override
    public String getContents() {
        return null;
    }

    @Override
    public void print(String doc) {

    }
}

