public class Main {
    public static void main(String[] args) {
        double firstVal = 20.00d;
        double secondVal = 80.00d;
        double result = (firstVal + secondVal) * 100;
        System.out.println(result);
        boolean isNoRemainder = (result % 40.00d) == 0 ? true : false;
        System.out.println(result % 40.00d);
        System.out.println("isNoRemainder = " + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }

    }
}