public class Bedroom {
    private double width;
    private double length;
    private Bed theBed;
    private Closet theCloset;

    public Bedroom(double width, double length, Bed theBed, Closet theCloset) {
        this.width = width;
        this.length = length;
        this.theBed = theBed;
        this.theCloset = theCloset;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Closet getTheCloset() {
        return theCloset;
    }

    public double getFreeSpace(){
        double bedSize = theBed.getBedSize();
        double closetSize = theCloset.getClosetArea();
        return width * length - bedSize - closetSize;
    }
}
