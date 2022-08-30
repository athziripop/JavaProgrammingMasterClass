public class Closet {
    private boolean isWalkingCloset;
    private boolean hasDivisions;
    private int numberOfDivisions;
    private double height;
    private double width;

    private double length;

    public Closet(boolean isWalkingCloset, boolean hasDivisions, int numberOfDivisions, double height, double width, double length) {
        this.isWalkingCloset = isWalkingCloset;
        this.hasDivisions = hasDivisions;
        this.numberOfDivisions = numberOfDivisions;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    private boolean isWalkingCloset() {
        return isWalkingCloset;
    }

    private boolean isHasDivisions() {
        return hasDivisions;
    }

    private int getNumberOfDivisions() {
        return numberOfDivisions;
    }

    private double getHeight() {
        return height;
    }

    private double getWidth() {
        return width;
    }

    private double getLength() {
        return length;
    }

    public double getClosetVolume(){
        return height * width * length;
    }

    public double getClosetArea(){
        return width * length;
    }
}
