public class Main {
    public static void main(String[] args) {
        SortedArray array = new SortedArray();

        int[] arrayTo = array.getIntegers(5);
        array.printArray(arrayTo);
        int[] sorted = array.sortIntegers(arrayTo);
        array.printArray(sorted);
    }
}