public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(getDurationString(60,20));
//        System.out.println(getDurationString(65));
//        System.out.println(area(5.0));
//        System.out.println(area(-1));
//        System.out.println(area(5.0, 4.0));
//        System.out.println(area(-1.0, 4.0));
//        printYearsAndDays(-525600);
//        printYearsAndDays(1051200);
//        printYearsAndDays(561600);
//        printEqual(1, 1, 1);
//        printEqual(1, 1, 2);
//        printEqual(-1, -1, -1);
//        printEqual(1, 2, 3);
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59) return "Invalid Value";
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String result = (hours + "h " + remainingMinutes + "m " + seconds + "s");
            if(hours < 10){
                 result = ("0" + hours + "h " + remainingMinutes + "m " + seconds + "s");
                 if(remainingMinutes < 10){
                     result = ("0" + hours + "h " + "0" + remainingMinutes + "m " + seconds + "s");
                     if(seconds < 10){
                         result = ("0" + hours + "h " + "0" + remainingMinutes + "m " + "0" + seconds + "s");
                     }
                 }

            }
        return result;
    }
    public static String getDurationString(int seconds){
        if(seconds < 0) return "Invalid Value";
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static double area(double radius){
        if(radius < 0) return -1.0;
        return Math.PI * radius * radius;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0) return -1.0;
        return x * y;
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) System.out.println("Invalid Value");
        else{
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;

            long remMinutes = minutes % 60;
            long remHours = hours % 24 + remMinutes;
            long remYears = days % 365 + remHours;

            System.out.println(minutes + " min = " + years + " y and " + remYears + " d");
        }
    }
    public static void printEqual(int a, int b, int c){
        if(a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        }else if( a == b && b == c){
            System.out.println("All numbers are equal");
        }else if(a != b && b != c && a != c){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && temperature <= 45 && temperature >= 25) return true;
        if(temperature <= 35 && temperature >= 25) return true;
        return false;
    }
}