public class ByteShortIntLong {
    public static void main (String[] args){
        int myValue = 2_147_483_647;
        int myMinInt = Integer.MIN_VALUE - 1;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println("min: " + myMinInt);
        System.out.println("max: " + myMaxInt);
        System.out.println("busted max: " + (myMaxInt+1));
        System.out.println(myValue);


        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("min: " + myMinByte);
        System.out.println("min: " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("min: " + myMinShort);
        System.out.println("min: " + myMaxShort);
        
        long myLong = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("min: " + myMinLong);
        System.out.println("min: " + myMaxLong);

        byte myNewByte = (byte)(myMinByte / 2) ;
        short myNewShort = (short)(myMinShort / 2);


        
    }
}
