public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //System.out.println(calcFeetAndInchesToCentimeters(24));
        System.out.println(calcFeetAndInchesToCentimeters(157));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        System.out.println(feet);
        System.out.println(inches);
        if(feet < 0 || inches < 0 || inches > 12) return -1;
        return (feet * 12 * 2.54) + (inches * 2.54);
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0) return -1;
        return calcFeetAndInchesToCentimeters((int)inches / 12, (int) inches % 12);
    }
}