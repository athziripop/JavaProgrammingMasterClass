public class Printer {
    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 0 || tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }

        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount ){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(tonerAmount + tonerLevel > 100) return -1;
            tonerLevel += tonerAmount;
        }else{
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;

        if(duplex){
            pagesToPrint = pages/2 + pages%2;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
