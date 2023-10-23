import java.util.Scanner;

public class Series extends Number {
    private int sum;

    public Series(int nn) {
        super(nn);
        this.sum = 0;
    }

    private void calcsum() {
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
    }

    public void display() {
        super.display();
        System.out.println("Sum of series : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int nn = sc.nextInt();
        Series series = new Series(nn);
        series.calcsum();
        series.display();
        sc.close();
    }
}
