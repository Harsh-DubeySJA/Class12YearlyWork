import java.util.Scanner;

public class Perfect {
    private int num;

    public Perfect(int nn) {
        num = nn;
    }

    private int sum_of_factors(int i) {
        if (i == num/2) return i + 1;
        if (num % i == 0) return i + sum_of_factors(i + 1);
        else return sum_of_factors(i + 1);
    }

    private void check() {
        if (sum_of_factors(2) == num) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perfect perfect = new Perfect(sc.nextInt());
        perfect.check();
        sc.close();
    }
}
