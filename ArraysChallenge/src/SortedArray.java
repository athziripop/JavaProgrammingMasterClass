import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size){
        int[] numbers =  new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    public static void printArray(int[] numbers){
        for(int i =0; i < numbers.length; i++){
            System.out.println("Element "+ i + " contents " + numbers[i]);
        }
    }
    public static int[] sortIntegers(int[] numbers ){
        Arrays.sort(numbers);
        int size = numbers.length;
        int[] sortedNumbers = new int[size];
        int j = 0;
        for(int i = size - 1; i >= 0; i--){
            sortedNumbers[j] = numbers[i];
            j++;
        }
        return sortedNumbers;
    }
}
