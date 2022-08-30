public class Vehicle {

    private boolean hasWindows;
    private String model;

    public Vehicle(boolean hasWindows, String model) {
        this.hasWindows = hasWindows;
        this.model = model;
    }

    public boolean isHasWindows() {
        return hasWindows;
    }

    public void setHasWindows(boolean hasWindows) {
        this.hasWindows = hasWindows;
    }

    public void move(){
        System.out.println("Vehicle moved");
    }
}
