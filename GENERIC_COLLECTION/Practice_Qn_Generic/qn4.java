public class qn4 {

    // Generic method to count occurrences
    public static <T> int countOccurrences(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element.equals(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 2, 4, 2, 5};
        System.out.println(countOccurrences(numbers, 2)); // 3
    }
}



