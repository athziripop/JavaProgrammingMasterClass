import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] numbers){
        System.out.println("Array = " + Arrays.toString(numbers));
        int n  = numbers.length - 1;
        for(int i =0; i <= n / 2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[n - i];
            numbers[n - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(numbers));
    }
}
