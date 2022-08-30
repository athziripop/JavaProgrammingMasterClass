public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println(sumOdd(1, 100));
//        System.out.println(sumOdd(-1, 100));
//        System.out.println(sumOdd(100, 100));
//        System.out.println(sumOdd(13, 13));
//        System.out.println(sumOdd(100, -100));
//        System.out.println(sumOdd(100, 1000));
//        System.out.println(isPalindrome(12));
//        System.out.println(isPalindrome(-1221));
//
//        System.out.println(isPalindrome(707));
//
//        System.out.println(isPalindrome(11212));
//        System.out.println(sumFirstAndLastDigit(100));
//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(257));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(-10));
//        System.out.println(getEvenDigitSum(252));
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(-22));
//        System.out.println(hasSharedDigit(12,23));
//        System.out.println(hasSharedDigit(9,99));
//        System.out.println(hasSharedDigit(15,55));
//        System.out.println(hasSameLastDigit(41, 22, 71));
//        System.out.println(hasSameLastDigit(23, 32, 42));
//        System.out.println(hasSameLastDigit(9, 99, 999));
//        System.out.println(getGreatestCommonDivisor(25, 15));
//        System.out.println(getGreatestCommonDivisor(12,30));
//        System.out.println(getGreatestCommonDivisor(9, 18));
//        System.out.println(getGreatestCommonDivisor(81, 153));
//        printFactors(-1);
//        System.out.println(isPerfectNumber(6));
//        System.out.println(isPerfectNumber(28));
//        System.out.println(isPerfectNumber(5));
//        System.out.println(isPerfectNumber(-1));
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        numberToWords(123);
//        System.out.println("------------------");
//        numberToWords(1010);
//        System.out.println("------------------");
//        numberToWords(1000);
//        System.out.println("------------------");
        numberToWords(0);



    }

    public static boolean isOdd(int number){
        if(number < 0) return false;
        if(number % 2 != 0) return true;
        return false;
    }
    public static int sumOdd(int start, int end){
        if(end < start || end < 0 || start < 0) return -1;
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(int number){
        int reversed = 0;

        if(number < 0 ){
            number *= -1;
        }

        int copyNumber = number;
        while(number > 0){
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }
        return reversed == copyNumber;
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0) return -1;
        int firstDigit = number % 10;
        int lastDigit = 0;
        while (number > 0){
            lastDigit = number % 10;
            number /= 10;
            //System.out.println(number);
        }
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;
        int result = 0;

        while(number > 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                result += digit;
            }
            number /= 10;
        }

        return result;
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        while(num1 > 0){
            int digit = num1 % 10;
            int copy2 = num2;
            while (num2 > 0){
                int digit2 = num2 % 10;
                if(digit == digit2) return true;
                num2 /= 10;
            }
            num1 /= 10;
            num2 = copy2;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 ||num3 < 10 || num3 > 1000 ) return false;
         return num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10 ;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000) return false;
        return true;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) return -1;
        int result = 0;
        int start = Math.min(first, second);
        for(int i = start ; i > 0; i--){
            int divider = first % i;
            if(divider == 0){
                for(int j = i; j > 0; j--){
                    int divider2 = second % j;
                    if(i == j && divider2 == 0){
                        return  j;
                    }
                }
            }
        }
        return result;
    }

    public static void printFactors(int number){
        if(number < 1) System.out.println("Invalid Value");
        else{
            for(int i = 1; i <= number; i++){
                if(number % i == 0) System.out.println(i);
            }
        }
    }
    public static boolean isPerfectNumber(int number){
        if(number < 1) return false;
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum+=i;
            }
        }
        return sum == number;
    }

    public static int reverse(int number){
        int reversed = 0;
        boolean isNegative = false;
        if(number < 0 ){
            number *= -1;
            isNegative = true;
        }
        while(number > 0){
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }
        if(isNegative) reversed *= -1;
        return reversed;
    }

    public static int getDigitCount(int number){
        if(number < 0) return -1;
        int result = 0;
        do{
            result++;
            number /= 10;
        }while(number > 0);
        return result;
    }

    public static void numberToWords(int number){
        if(number < 0) System.out.println("Invalid Value");
        else if(number == 0) System.out.println("Zero");
        else{
            int reversedNumber = reverse(number);
            int digitsOnReversed = getDigitCount(reversedNumber);
            while(reversedNumber > 0){
                switch (reversedNumber % 10){
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eighth");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                }
                reversedNumber /= 10;
            }
            for(int i = digitsOnReversed; i < getDigitCount(number); i++){
                System.out.println("Zero");
            }

        }
    }

}