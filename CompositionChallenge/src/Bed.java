public class Bed {
    private String size;
    private boolean hasHeadBoard;
    private boolean isBunk;

    private double width;

    private double length;

    public Bed(String size, boolean hasHeadBoard, boolean isBunk, double width, double length) {
        this.size = size;
        this.hasHeadBoard = hasHeadBoard;
        this.isBunk = isBunk;
        this.width = width;
        this.length = length;
    }

    private String getSize() {
        return size;
    }

    private boolean isHasHeadBoard() {
        return hasHeadBoard;
    }

    private boolean isBunk() {
        return isBunk;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getBedSize(){
        return width * length;
    }


}
