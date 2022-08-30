public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bed bed = new Bed("queen", false, false,6, 3);
        Closet closet = new Closet(true, true, 8,2,5,10);

        Bedroom bedroom = new Bedroom(10,20,bed,closet);


        System.out.println(bedroom.getFreeSpace());
        System.out.println(bedroom.getTheBed().getBedSize());
    }
}