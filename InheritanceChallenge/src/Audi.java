public class Audi extends Car{

    private String model;
    private boolean hasTurbo;

    public Audi(String color, int year, String model1, boolean hasTurbo) {
        super(true, "S3", 4, color, year);
        this.model = model1;
        this.hasTurbo = hasTurbo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHasTurbo() {
        return hasTurbo;
    }

    public void setHasTurbo(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }
}
