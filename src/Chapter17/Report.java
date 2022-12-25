package Chapter17;

class Report implements Printable, Upper {
    String cons;

    Report(String cons) {
        this.cons = cons;
    }

    @Override
    public void print(String doc) {

    }

    @Override
    public void printLine(String str) {

    }

    public String getContents() {
        return cons;
    }

    public void printContents(Printable doc) {

        if(doc instanceof Upper) {
            System.out.println((doc.getContents()).toUpperCase());
        }
        else if(doc instanceof Lower) {
            System.out.println((doc.getContents()).toLowerCase());
        }
        else
            System.out.println(doc.getContents());
    }

}

