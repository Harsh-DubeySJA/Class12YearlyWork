import java.util.Scanner;
import java.util.Arrays;

public class BST {
    static class ElementNotFoundException extends RuntimeException {
        public ElementNotFoundException() {
            throw new RuntimeException("Element not found");
        }
    }
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }
    public static int binarySearch(int[] array, int n, int size) {
        sortArray(array);   
        return binarySearchRecursive(array, n, 0, size);
    }
    public static int binarySearchRecursive(int[] array, int n, int start, int size) {
        if (array[size - 1] == n) return size;
        else if (start >= size) throw new ElementNotFoundException();
        if (n <= array[size%2])
            return binarySearchRecursive(array, n, start, size/2);
        else
            return binarySearchRecursive(array, n, size/2, size-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of Elements :: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Elements");
        for (int i = 0; i < size; i++) {
            array [i] = sc.nextInt();
        }
        System.out.print("Element to be searched :: ");
        int n = sc.nextInt();
        try {
            System.out.println("Element present at " + (binarySearch(array, n, size)));
        } catch (Exception e) {
            System.out.println("Element not present in the array.");
        }
        sc.close();
    }
}
