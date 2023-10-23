import java.util.Scanner;

public class EqMat {
    private int[][] a;
    private int m;
    private int n;

    public EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        a = new int[n][m];
    }

    private void readarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements of the array : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    private int check(EqMat P, EqMat Q) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (P.a[i][j] != Q.a[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    private void print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows in Matrix : ");
        int mm = sc.nextInt();
        System.out.print("Number of columns in Matix : ");
        int nn = sc.nextInt();
        EqMat eqMat1 = new EqMat(mm, nn);
        eqMat1.readarray();
        EqMat eqMat2 = new EqMat(mm, nn);
        eqMat2.readarray();
        EqMat result = new EqMat(mm, nn);
        if (result.check(eqMat1, eqMat2) == 1) {
            System.out.println("Both matrices are equal");
        } else {
            System.out.println("Matices are unequal.");
        }
        System.out.println("Matix 1");
        eqMat1.print();
        System.out.println("Matix 2");
        eqMat2.print();
        sc.close();
    }
}
