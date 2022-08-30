public class Main {
    public static void main(String[] args) {
        byte chalByte = 120;
        short chalShort = 12000;
        int chalInt = 12000000;
        long chalLong = 50000 + (10 * (chalByte + chalShort + chalInt));
        System.out.println(chalLong);
    }
}