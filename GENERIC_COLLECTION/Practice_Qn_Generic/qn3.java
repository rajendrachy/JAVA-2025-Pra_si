public class qn3 {

    // Generic method to swap
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        swap(arr, 1, 3);

        for (String s : arr) {
            System.out.print(s + " ");  // A D C B
        }
    }
}


