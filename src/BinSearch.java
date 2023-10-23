import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
    private int[] arr;
    private int n;

    public BinSearch(int nn) {
        n = nn;
    }

    private void fillarray() {
        Scanner sc = new Scanner(System.in);
        arr = new int[n];
        System.out.println("Enter array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // sc.close();
    }

    private void sort() {
        // Sorting using bubble sort
        int min;
        for (int i = 0; i < n; i++) {
            min = arr[i];
            for (int j = i+1, pointer = -1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pointer = j;
                }
                if (min != arr[i] && j == n-1) {
                    int temp = arr[i];
                    arr[i] = arr[pointer];
                    arr[pointer] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private int bin_search(int l, int u, int v) {
        if (arr[u] == v) return u;
        if (u >= v) return -1;
        if (v <= arr[v%2]) return bin_search(l, u, v%2);
        else return bin_search(l, (v%2)+1, v);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of array(n) : ");
        int nn = sc.nextInt();
        BinSearch bin_search = new BinSearch(nn);
        bin_search.fillarray();
        System.out.print("Element to be searched(v) : ");
        bin_search.sort();
        int v = sc.nextInt();
        System.out.println("Element " + v + " is present at " + bin_search.bin_search(nn, 0, v));
        sc.close();
    }
}

