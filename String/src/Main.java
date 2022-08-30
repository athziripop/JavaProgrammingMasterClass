public class Main {
    public static void main(String[] args) {
        String myString = "This is my string";
        System.out.println(myString);
        myString = myString + " and also this!";
        System.out.println(myString);
        int myInt = 10;
        myString = myString + myInt;
        System.out.println(myString);
        double myDouble = 20.35d;
        myString = myString + myDouble;
        System.out.println(myString);
    }
}