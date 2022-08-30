public class Main {
    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("min float: " + myMinFloat);
        System.out.println("max float: " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("min double: " + myMinDouble);
        System.out.println("max double: " + myMaxDouble);

        int myInt = 5;
        float myFloat = (float)5.25;
        double myDouble = 5.25;

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(kilograms);

    }
}