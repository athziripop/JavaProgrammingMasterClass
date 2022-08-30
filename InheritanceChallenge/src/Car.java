public class Car extends Vehicle{
    private int gears;
    private String color;

    private int year;

    public Car(boolean hasWindows, String model, int gears, String color, int year) {
        super(true, model);
        this.gears = gears;
        this.color = color;
        this.year = year;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void changeGears(int gears){
        System.out.println("Change gear num:");
    }

    @Override
    public void move() {
        System.out.println("MOVE IN CAR");
        super.move();
    }
}
