import java.util.Scanner;

public class MinimumElement {

    private static  int readInteger(){
        int elements;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        elements = scanner.nextInt();

        return elements;
    }
    private static int[] readElements(int elements){
        int[] values = new int[elements];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + elements + " elements:");
        for(int i = 0; i < elements; i++){
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    private static int findMin(int[] values){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < values.length;i++){
            if(values[i] < min){
                min = values[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int size = readInteger();
        int[] values = readElements(size);
        int min = findMin(values);
        System.out.println("Min number is: " + min);
    }
}
