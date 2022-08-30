public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,11));
//        System.out.println(canPack(4,18,19));
//        System.out.println(canPack(0,5,6));
//        System.out.println(getLargestPrime(21));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
//        System.out.println(getLargestPrime(1));
//        System.out.println(getLargestPrime(7));
//        System.out.println(getLargestPrime(16));
        printSquareStar(8);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        for(int i = bigCount; i > 0; i--){
            if(goal - 5 < 0) break;
            goal-=5;
        }
        if(goal == 0) return true;
        if(goal <= smallCount) return true;
        return false;
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }

    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for(int i = 0; i < number; i++){
                for(int j = 0; j < number; j++){
                    if(i == 0) System.out.print("*");
                    else if(j == 0) System.out.print("*");
                    else if(i == number -1) System.out.print("*");
                    else if(j == number -1) System.out.print("*");
                    else if(i == j) System.out.print("*");
                    else if(j == number - (i +1)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}