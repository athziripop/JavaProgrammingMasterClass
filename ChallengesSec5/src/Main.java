import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true){
            System.out.println("Enter number");
            boolean isNextInt = scanner.hasNextInt();
            if(isNextInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else{
                long avg = Math.round((double) sum/count);
                System.out.println(count);
                System.out.println("SUM = "+sum+" AVG = " + avg);
                break;
            }

        }
        scanner.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        double area = width * height;
        double total = extraBuckets * areaPerBucket;
        double result = (total - area) / areaPerBucket;
        if(result < 0) result*= -1;
        return (int) Math.ceil(result);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }
    public static int getBucketCount(double area,  double areaPerBucket){
        return getBucketCount(area, 1, areaPerBucket);
    }
}