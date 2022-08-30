public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        printMegaBytesAndKiloBytes(2500);
//        printMegaBytesAndKiloBytes(-1024);
//        printMegaBytesAndKiloBytes(5000);
//        printConversion(1.5);
//        printConversion(10.25);
//        printConversion(-5.6);
//        printConversion(25.42);
//        printConversion(75.114);
//        System.out.println(shouldWakeUp(true, 1));
//        System.out.println(shouldWakeUp (false, 2));
//        System.out.println(shouldWakeUp (true, 8));
//        System.out.println(shouldWakeUp (true, -1));
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
//        System.out.println(hasEqualSum(1,1,1));
//        System.out.println(hasEqualSum(1,1,2));
//        System.out.println(hasEqualSum(1,-1,0));
        System.out.println(hasTeen(9,19,99));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes = kiloBytes / 1024;
            int remainingKilo = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilo + " KB");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour /  1.609);
    }

    public static void printConversion(double kilometersPerHour){
        double milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour == -1){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) return false;
        if(isDogBarking && (hourOfDay < 8 || hourOfDay > 22)) return true;
        return false;
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) return false;
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {
            return true;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if(num1 < 0){
            num1 *= -1;
            if(num2 < 0){
                num2 *= -1;
            }else{
                return false;
            }
        }
        if((Math.floor(num1 * 1000) / 1000 - Math.floor(num2 * 1000) / 1000) == 0) return true;
        return false;
    }

    public static boolean hasEqualSum(int a, int b, int c){
        return (a + b == c );
    }

    public static boolean hasTeen(int a, int b, int c){
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
    public static boolean isTeen(int age){
        return  (age >= 13 && age <= 19);
    }


}