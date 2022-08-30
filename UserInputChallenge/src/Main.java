import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 10;
        int valid = 0;
        int sum = 0;

        while (valid < total){
            System.out.println("Enter number #"+ (valid+1));

            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                sum+=number;
                valid++;
            }else {
                System.out.println("Invalid value");
            }
            scanner.nextLine();
        }
        System.out.println("Total is="+sum);
        scanner.close();
    }
}