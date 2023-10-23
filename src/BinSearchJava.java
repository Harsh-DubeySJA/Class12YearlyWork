import java.util.Arrays;
import java.util.Scanner;

public class BinSearchJava {
    private int[] arr;
    private int n;

    public BinSearchJava(int nn) {
        n = nn;
        arr = new int[n];
    }

    private void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    private void sort() {
       // Bubble sort
       for (int i = 0; i < n-1; i++) {
           for (int j = 0; j < n-i-1; j++) {
               if (arr[j] > arr[j+1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       // Selection sort
       for (int i = 0; i < n-1; i++) {
           int min = arr[i];
           for (int j = i+1, pos = i; j < n; j++) {
               if (arr[j] < min) {
                   pos = j;
                   min = arr[j];
               }
               if (j == n-1) {
                   int temp = arr[i];
                   arr[i] = min;
                   arr[pos] = temp;
               }
           }
       }
       // Insertion sort
       for (int i = 1; i < n; i++) {
           int current = arr[i];
           int j = i-1;
           while (j >= 0 && current < arr[j]) {
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = current;
       }
       System.out.println(Arrays.toString(arr));
    }

    private int bin_search(int l, int u, int v) {
        int mid = (l+u)/2;
        if (arr[mid] == v) return mid;
        else if (u <= l) return -1;
        else if (v < arr[mid]) return bin_search(l, mid, v);
        else return bin_search(mid+1, u, v);
    }

    public static void main(String[] args) {
        BinSearchJava binSearchJava = new BinSearchJava(5);
        binSearchJava.fillarray();
        binSearchJava.sort();
        System.out.println("Element present at " + binSearchJava.bin_search(0, 5, 5));
    }
}
