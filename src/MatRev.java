import java.util.Scanner;

public class MatRev {
    private int[][] arr;
    private int m;
    private int n;

    public MatRev(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    private void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements of the Matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    private int reverse(int x) {
        int c = 0;
        while (x > 0) {
            c = c * 10 + x % 10;
            x /= 10;
        }
        return c;
    }

    private void revMat(MatRev P) {
        for (int i = 0; i < P.m; i++) {
            for (int j = 0; j < P.n; j++) {
                arr[i][j] = reverse(P.arr[i][j]);
            }
        }
    }

    private void show() {
        System.out.println("Matrix Elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Rows : ");
        int mm = sc.nextInt();
        System.out.print("Number of Columns : ");
        int nn = sc.nextInt();
        MatRev matRev = new MatRev(mm, nn);
        MatRev P = new MatRev(mm, nn);
        P.fillarray();
        matRev.revMat(P);
        System.out.println("Matrix 1");
        P.show();
        System.out.println("Matrix 2");
        matRev.show();
        sc.close();
    }
}
